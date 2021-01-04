package functionTypeAndValue

object AssigningFunctionWithTheWildcardOperator {

  def main(args:Array[String]): Unit ={
    val amount = myDouble(20)
    println(amount)
    println(max(80,90))
    println(logStart())
  }

  def double(x: Int): Int = x * 2

  val myDouble = double _

  def max(a: Int, b: Int) = if (a > b) a else b

  def logStart() = "=" * 50 + "\nStarting NOW\n" + "=" * 50
}
