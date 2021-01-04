package expressionsAndConditionals

object IfExpressions {
  def main(args: Array[String]): Unit = {
    test1()
    test2()
  }

  def test1() = {
    if (47 % 3 > 0) println("Not a multiple of 3")
  }

  def test2() = {
    val result = if (true) "what does this return?"
    println(result)
  }

}
