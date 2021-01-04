package mutableCollections

object MutableCollections {
  def main(args:Array[String]): Unit ={
    var m = Map("AAPL" -> 597, "MSFT" -> 40)
    m - "AAPL" + ("GOOG" -> 521)
    println(m)
  }
}
