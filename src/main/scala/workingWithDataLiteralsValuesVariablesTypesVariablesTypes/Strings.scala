package workingWithDataLiteralsValuesVariablesTypesVariablesTypes

object Strings {

  def main(args: Array[String]): Unit = {
    test1();
    test2();
    test3();
  }

  def test1() = {
    val hello = "Hello There"
    val signature = "With Regards, \nYour friend"
    println(hello)
    println(signature)
  }

  def test2() = {
    val greeting = "Hello, " + "World"
    val matched = (greeting == "Hello, World")
    val theme = "Na \n" * 16 + "Batman!" // what do you expect this to print?
    println(theme)
  }

  def test3() = {
    val greeting =
      """
      She suggested reformatting the file
      by replacing tabs  with newlines ;
      "Why do that?", he asked.
      """
    println(greeting)
  }

  def test4() = {

  }
}
