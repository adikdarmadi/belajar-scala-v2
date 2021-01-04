package collection

object BooleanReduce {
  def main(args: Array[String]): Unit = {
    contains()
    endsWith()
    exists()
    forAll()
  }

  def contains(): Unit = {
    var data = List(34, 29, 18) contains 29
    println(data)
  }

  def endsWith(): Unit = {
    var data = List(0, 4, 3) endsWith List(0, 4, 3)
    println(data)
  }

  def forAll(): Unit = {
    var data = List(24, 17, 32) forall (_ < 18)
    println(data)
  }

  def exists(): Unit = {
    var data = List(24, 17, 18) exists (_ < 18)
    println(data)
  }
}
