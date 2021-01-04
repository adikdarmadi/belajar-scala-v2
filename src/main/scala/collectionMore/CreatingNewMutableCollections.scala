package collectionMore

object CreatingNewMutableCollections {
  def main(args: Array[String]): Unit = {
    test1();
    test2();
  }

  def test1(): Unit = {
    val nums = scala.collection.mutable.Buffer(1)
    for (i <- 2 to 10) nums += i
    println(nums)
  }

  def test2(): Unit = {
    val nums = scala.collection.mutable.Buffer[Int]()
    for (i <- 1 to 10) nums += i
    println(nums.toList)
  }
}
