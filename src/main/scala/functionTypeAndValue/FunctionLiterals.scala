package functionTypeAndValue

object FunctionLiterals {
  def main(args: Array[String]): Unit = {
    println(doubler(2))

    val greeter = (name: String) => s"Hello, $name"
    val hi = greeter("World")
    println(hi)

    println(maximize(1,2))
  }

  val doubler = (x: Int) => x * 2

  def max(a: Int, b: Int) = if (a > b) a else b
  val maximize: (Int, Int) => Int = max

}
