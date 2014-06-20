object Collections {
  /**
  * TODO:
  * Compute the sum of all elements in the List
  * var are authorized
  * @param xs A list of Int
  * @return The sum of all elements in the List
  */
  def uglysum(xs: List[Int]): Int = {
    TODO
  }

  //  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★
  //  ★                                                                                   ★
  //  ★   /$$   /$$ /$$$$$$$$ /$$      /$$       /$$$$$$$  /$$   /$$ /$$       /$$$$$$$$  ★
  //  ★  | $$$ | $$| $$_____/| $$  /$ | $$      | $$__  $$| $$  | $$| $$      | $$_____/  ★
  //  ★  | $$$$| $$| $$      | $$ /$$$| $$      | $$  \ $$| $$  | $$| $$      | $$        ★
  //  ★  | $$ $$ $$| $$$$$   | $$/$$ $$ $$      | $$$$$$$/| $$  | $$| $$      | $$$$$     ★
  //  ★  | $$  $$$$| $$__/   | $$$$_  $$$$      | $$__  $$| $$  | $$| $$      | $$__/     ★
  //  ★  | $$\  $$$| $$      | $$$/ \  $$$      | $$  \ $$| $$  | $$| $$      | $$        ★
  //  ★  | $$ \  $$| $$$$$$$$| $$/   \  $$      | $$  | $$|  $$$$$$/| $$$$$$$$| $$$$$$$$  ★
  //  ★  |__/  \__/|________/|__/     \__/      |__/  |__/ \______/ |________/|________/  ★
  //  ★                                                                                   ★
  //  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★
  //  ★                                                                                   ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                                                                                   ★
  //  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★

  /**
  * TODO:
  * Compute the sum of all elements in the List
  */
  def sum(xs: List[Int]): Int = {
    TODO
  }

  /**
  * TODO:
  * Add 2 to all elements of the provided List
  */
  def add2toAlll(xs: List[Int]): List[Int] = TODO

  /**
  * TODO:
  * Add 2 to all elements of the provided List
  * (xs: List[Int])(x: Int)
  * - This is called a curried Function
  * - It's equivalent to
  *    Int => (List[Int] => List[Int])
  * - It takes a Int as a parameter (x) and returns a function, taking a List[Int], and returning a List[Int]
  */
  def addToAll(xs: List[Int])(x: Int): List[Int] = TODO

  /**
  * TODO:
  * Rewrite add2toAll using addToAll and partial function application
  */
  def nicelyAdd2ToAll(xs: List[Int]): List[Int] = TODO

  /**
  * TODO:
  * Write the map function
  * This function applies the f function to all the elements of xs
  */
  def map(f: (Int => Int))(xs: List[Int]): List[Int] = TODO

  /**
  * TODO:
  * Explain what this does
  */
  def add2ToAllAgain(xs: List[Int]): List[Int] = map(x => x + 2)(xs)

  /**
  * TODO:
  * Explain how this works
  */
  val add2ToAllAgainAlternative = map(x => x + 2) _

  /**
  * TODO:
  * Write the reduce function
  * reduce((acc, current) => acc + current)(List(1, 2, 3, 4, 5)) == 15
  */
  def reduce(f: (Int, Int) => Int)(xs: List[Int]): Int = TODO

  /**
  * TODO:
  * Write the fold function
  */
  def fold(f: (Int, Int) => Int, init: Int)(xs: List[Int]): Int = TODO

  /**
  * TODO:
  * re-write reduce using fold
  */
  def reduceByFolding(f: (Int, Int) => Int)(xs: List[Int]): Int = TODO

  /**
  * TODO:
  * re-write the map function using fold
  * you can use List#foldLeft
  */
  def mapByFolding(f: Int => Int)(xs: List[Int]): List[Int] = TODO

  // >>> Read It Later
  //  ➽ http://www.codecommit.com/blog/scala/scala-collections-for-the-easily-bored-part-1
  //  ➽ http://www.codecommit.com/blog/scala/scala-collections-for-the-easily-bored-part-2
  //  ➽ http://www.codecommit.com/blog/scala/scala-collections-for-the-easily-bored-part-3
}