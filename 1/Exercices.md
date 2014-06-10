# Play@MFG - Session 1

## Prerequisites

- a text editor
- a browser
- Activator
- sbt
- curl

## Resources

- http://playframework.com/documentation/2.3.x/Home
- http://playframework.com/documentation/2.3.x/ScalaHome

## Bootstrap

1. Create an new Play Scala application using activator
1. Run the play application using sbt
1. Go to http://localhost:9000, you should see a "Welcome to Play" page.

## Hello World

1. Create a new object `Hello` in package controllers
1. Create a `hello` Action returning a 200 HTTP response (OK), containing the text "Hello World" [doc](http://playframework.com/documentation/2.3.x/ScalaActions)
1. Create a new route `/hello`. [doc](http://playframework.com/documentation/2.3.x/ScalaRouting)

## Hello Dave

1. Modify the `hello` Action and the `/hello` route. Add a String `name` in the querystring, so that `/hello?name=Dave` returns a 200 HTTP response (OK), containing the text "Hello Dave". [doc](http://playframework.com/documentation/2.3.x/ScalaResults)
1. Make the name parameter Optional.
	- `/hello?name=Dave` should return a 200 HTTP response (OK), containing the text "Hello Dave".
	- `/hello` should return a 200 HTTP response (OK), containing the text "Hello World".

## HTML Template

Create a new HTML [template](http://playframework.com/documentation/2.3.x/ScalaTemplates). The `hello` action should new return a valid HTML document created via the template engine. The document should contain an `h1` containing `hello <name>` or `hello world`. [json doc](http://www.playframework.com/documentation/2.3.x/ScalaJson)

## Content Negotiation

1. Modify the hello Action to support both HTML and Json based on the Accept header [see the Content-Negotiation documentation ](http://playframework.com/documentation/2.3.x/ScalaContentNegotiation).
1. Test the action using curl.

## Login flow

1. Create a new Login controller
1. Create the `login` Action and the `/login` route.
	- It should return a HTML page containing a form. The form should have a login and a password field.
1. Create the `authenticate` Action, and the `/authenticate` route. Leave it unimplemented for now using `def authenticate = TODO`.
1. Use the [reverse router](http://www.playframework.com/documentation/2.3.x/ScalaRouting) to set the `action` parameter of the form tag. The form should be submitted to `authenticate`.
1. Implement `authenticate`. Make it check the username / password. The only valid values are "play" / "play".
	- If the authentication is successful, redirect to the `hello` action (use the reverse router!), and add the username in the [session](http://www.playframework.com/documentation/2.3.x/ScalaSessionFlash).
	- If the authentication fails, send a 401 status, and the login form. The login form should display an error message.

## Action composition

1. The `hello` action should be authenticated. Use an [Action builder](http://playframework.com/documentation/2.3.x/ScalaActionsComposition) to create an `Authenticated` Action. This function will check the user authentication status.
- If the session does not contain a username, the user is not logged-in and should be redirected to `login`
- Otherwise, the user can access the requested resource.
1. Compose this Action with `hello` to protect it from unauthorized access.
1. Use the update the HTML template to show "Hello, <username>".
