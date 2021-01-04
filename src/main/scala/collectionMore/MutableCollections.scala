package collectionMore

object MutableCollections {
  def main(args: Array[String]): Unit = {
    val m = Map("AAPL" -> 597, "MSFT" -> 40)
    val n = m - "AAPL" + ("GOOG" -> 521)
    println(n)
  }
}
