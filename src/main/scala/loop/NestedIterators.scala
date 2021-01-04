package loop

object NestedIterators {
  def main(args: Array[String]): Unit = {
    test1()
    test2()
  }

  //cara 1
  def test1(): Unit = {
    for {x <- 1 to 2
         y <- 1 to 3} {
      print(s"($x,$y) ")
    }
    println()
  }

  //cara 2
  def test2(): Unit = {
    for (x <- 1 to 2)
    {
      for(y <- 1 to 3){
        print(s"($x,$y) ")
      }

    }
  }
}
