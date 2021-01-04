package loop

object Loop {


  def main(args: Array[String]): Unit = {
    test1()
    test2()
    test3()
  }


  def test1(): Unit = {
    for (x <- 1 to 7) {
      println(s"Day $x")
    }

  }

  def test2(): Unit = {
    for (x <- 1 to 7) yield {
      s"Day $x:"
    }
  }

  def test3(): Unit = {
    val a = Array(8, 3, 1, 6, 4, 5)

    // Using yield with for
    var print = for (e <- a if e > 4) yield e
    for (i <- print) {
      // Printing result
      println(i)
    }

  }
}
