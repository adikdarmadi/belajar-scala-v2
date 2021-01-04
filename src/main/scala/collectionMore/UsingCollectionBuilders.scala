package collectionMore

object UsingCollectionBuilders {
    def main(args:Array[String]): Unit ={
      val b = Set.newBuilder[Char]
      b += 'h'
      b ++= List('e', 'l', 'l', 'o')
      val helloSet = b.result
      println(helloSet)


      val mb = scala.collection.immutable.Map.newBuilder[String, Int]
      mb += ("a" -> 1)  // stuff
      println(mb.result().get("a"))
      val op:Option[Int]=mb.result().get("a")
      if(op.isDefined){
        println(op.get)
      }

      var dataList=List("1","2","3")
      val mb2 = scala.collection.immutable.Map.newBuilder[String, Object]
      mb2+=("data1"->dataList)
      val op2:Option[Object]=mb2.result().get("data1")
      if(op2.isDefined){
        println(op2.get)
      }
    }
}
