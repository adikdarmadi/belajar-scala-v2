package collection

object MappingLists {
  def main(args: Array[String]): Unit = {
    test1()
    test2()
    test3()
  }

  def test1(): Unit = {
    var data: List[Int] = List(1, 2, 3, 4)
    data.collect {
      case 1 => (
        println("ok 1")
        )
      case 2 => {
        println("ok 2")
      }

    }
  }

  def test2(): Unit = {
    var a = List("milk,tea") flatMap (_.split(','))
    for(i<-0 to a.size-1){
     println(a(i))
    }
  }

  def test3(): Unit = {
    var a = List("milk","tea") map (_.toUpperCase)
    for(i<-0 to a.size-1){
      println(a(i))
    }
  }
}
