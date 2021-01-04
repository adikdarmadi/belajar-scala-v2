package mutableCollections

object CreatingMutableCollectionsFromImmutableOnes {
    def main(args:Array[String]): Unit ={
      val m = Map("AAPL" -> 597, "MSFT" -> 40)
      val b = m.toBuffer
      //remove map index 1
      b trimStart 1
      b += ("GOOG" -> 521)
      println(b)
      val n = b.toMap
      b += ("GOOG" -> 521)
      println(b)
      val l = b.toList
      val s = b.toSet
      println(s)

    }
}
