package functionTypeAndValue

object HighOrderFunction {
  def main(args: Array[String]): Unit = {
    safeStringOp(null, reverser)
    println(safeStringOp("Ready", reverser))
    println(safeStringOpBiasa("adik"))

  }

  def safeStringOp(s: String, f: String => String) = {
    if (s != null) f(s) else s
  }

  def reverser(s: String) = s.reverse

  def safeStringOpBiasa(s: String): String = {
    s.reverse
  }
}
