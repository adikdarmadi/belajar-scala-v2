package collection

object LearningList {


  def main(args: Array[String]): Unit = {
    test1()
    test2()
    test3()
    test4()

  }

  def test1(): Unit = {
    val fruit = List("apples", "oranges", "pears")
    for (i <- 0 to fruit.size - 1) {
      println(fruit(i))
    }
  }

  def test2(): Unit = {
    val keyValues = List(('A', 65, 12), ('B', 66), ('C', 67))
    for (i <- 0 to keyValues.size - 1) {
      println(keyValues(i))
    }
  }

  def test3(): Unit = {
    val primes = List(2, 3, 5, 7, 11, 13)
    var i = primes
    while (i != Nil) {
      println(i.head + ", ");
      i = i.tail
    }
  }

  def test4(): Unit ={
    val l: List[Int] = List()
    println(l == Nil)

    val m: List[String] = List("a")
    println(m.head)
    println(m.head)
    println(m.tail == Nil)
  }

  def test5(): Unit ={
    val l: List[Int] =  List(1, 2, 3, 4):+5

  }
}
