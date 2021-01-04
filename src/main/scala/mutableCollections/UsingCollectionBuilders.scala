package mutableCollections

object UsingCollectionBuilders {
  def main(args: Array[String]): Unit = {
    test1()
  }

  def test1(): Unit = {
    val b = scala.collection.mutable.Buffer[Char]()
    b += 'h'
    b ++= List('e', 'l', 'l', 'o')
    val helloSet = b.size
    println(helloSet)

  }
}
