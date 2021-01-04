package functionTypeAndValue

object PartiallyAppliedFunctionsAndCurrying {
  def main(args: Array[String]): Unit = {
    val f = factorOf _
    val x = f(7, 20)
    println(x)
    val isEven = factorOf1(2) _
    val z = isEven(32)
    println(z)

  }

  def factorOf(x: Int, y: Int) = y % x == 0

  def factorOf1(x: Int)(y: Int) = y % x == 0

}
