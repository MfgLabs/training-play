package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent._

object Hello extends Controller {
	import Security._

	def hello = Authenticated { implicit r =>
		val text = s"Hello ${r.username}"
		render {
	    case Accepts.Html() => Ok(views.html.hello(text))
	    case Accepts.Json() => Ok(Json.obj("hello" -> text))
	  }
	}
}

object Login extends Controller {
	import play.api.data._
	import play.api.data.Forms._

	val loginForm = Form(
		tuple(
			"login" -> text.verifying("login.invalid", _ == "jto"),
			"password" -> text.verifying("password.invalid", _ == "s3cr3t")))

	def login = Action {
		Ok(views.html.login(loginForm))
	}

	def logout = Action {
		Redirect(routes.Login.login).withNewSession
	}

	def authenticate = Action { implicit request =>
		loginForm.bindFromRequest.fold(
			err => Ok(views.html.login(err)),
			{ case (login, _) => Redirect(routes.Hello.hello()).withSession("username" -> login) }
		)
	}
}

object Security {
	import Results._

	case class AuthenticatedRequest[A](val username: String, request: Request[A]) extends WrappedRequest[A](request)

	object Authenticated extends ActionBuilder[AuthenticatedRequest] {
	  def invokeBlock[A](request: Request[A], block: AuthenticatedRequest[A] => Future[Result]) = {
	    request.session.get("username").map{ u =>
		  	block(AuthenticatedRequest(u, request))
		  }.getOrElse(Future.successful(Forbidden("Niet")))
	  }
	}
}