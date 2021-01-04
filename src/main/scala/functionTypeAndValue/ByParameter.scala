package functionTypeAndValue

object ByParameter {
  def main(args: Array[String]): Unit = {


    println(doubles(5))
    doubles(fungsiF(8))
  }

  def doubles(x: Int) = {
    println("Now doubling " + x)
    x * 2
  }

  def fungsiF(i: Int) = {
    println(s"Hello from f($i)");
    i
  }
}
