package collection

object ConvertingCollections {
  def main(args: Array[String]): Unit = {
//    mkString()
//    toBuffer()
//    toList()
//    toMap()
//    toSet()
    toString1()
//    getValueByKeyMap()
  }

  def mkString(): Unit = {
    var data = List(24, 99, 104).mkString(", ")
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  def toBuffer(): Unit = {
    var data = List('f', 't').toBuffer
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  def toList(): Unit = {
    var data = Map("a" -> 1, "b" -> 2).toList
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  def toMap(): Unit = {
    var data=Array(1 -> true, 3 -> true).toMap
    println(data(1))
  }

  def toSet(): Unit = {
    var data=List("adik",2,3).toSet
    for(i<- 0 to data.size-1){
      println(data(i))
    }
  }

  def toString1(): Unit = {
    var data=List(2, 5, 5, 3, 2).toString
    for(i<- 0 to data.length-1){
      println(data(i))
    }
  }


  def getValueByKeyMap(): Unit = {
    var data = Map("a" -> List(1,2,3,"4a"), "b" -> 2)
    var dt=data("a")
    val wrapped = dt.asInstanceOf[List[Int]]
    for(i<- 0 to wrapped.length-1){
      println(wrapped(i))
    }

  }
}
