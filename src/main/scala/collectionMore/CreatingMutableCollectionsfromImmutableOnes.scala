package collectionMore

object CreatingMutableCollectionsfromImmutableOnes {
  def main(args: Array[String]): Unit = {
    val m = Map("AAPL" -> 597, "MSFT" -> 40)
    val b = m.toBuffer
    b trimStart 1
    println(b)
    b += ("GOOG" -> 521)
    println(b)
    val n = b.toMap
  }
}
