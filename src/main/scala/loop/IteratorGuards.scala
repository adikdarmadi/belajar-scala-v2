package loop

object IteratorGuards {


  def main(args: Array[String]): Unit = {
    test1()
    test2()
    test3()
  }


  def test1(): Unit = {
    for (i <- 1 to 20 if i % 3 == 0) {
      println(i)
    }

  }

  def test2(): Any = {
    val threes = for (i <- 1 to 20 if i % 3 == 0) yield i
    threes
  }

  def test3() = {
    val quote = "Faith,Hope,Charity"
    //    var listString=quote.split(",")
    //    println(listString.size)
    for {
      t <- quote.split(",")
      if t != null && t.size > 0

    } {
      println(t)
    }

  }
}
