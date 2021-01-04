package collectionMore

object TryCollections {
  def main(args: Array[String]): Unit = {
    // var  x= loopAndFail(10, 3)
    var x = loopAndFail(1, 3)
    println(x)
    val input = " 123 "
    val result = util.Try(input.toInt) orElse util.Try(input.trim.toInt)
    println(result.get)
  }

  def loopAndFail(end: Int, failAt: Int): Int = {
    for (i <- 1 to end) {
      println(s"$i) ")
      if (i == failAt) throw new Exception("Too many iterations")
    }
    end
  }

}
