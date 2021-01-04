package functionTypeAndValue

object PlaceholderSyntax {
  def main(string: Array[String]): Unit = {
    val doubler: Int => Int = _ * 2
    println(safeStringOp(null, _.reverse))
    println(safeStringOp("Adik", _.reverse))
    println(combination(2, 5, _ / _))
    println(combinationTest(10, 5, _ / _))
    println(tripleOp[Int,Int](1, 2, 3, _ * _ + _))
    println(tripleOp[Int,Double](10, 20, 3, 1.0 * _ / _ / _))
    println( tripleOp[Int,Boolean](93, 92, 14, _ > _ + _))
  }

  def safeStringOp(s: String, f: String => String) = {
    if (s != null) f(s) else s
  }

  def combination(x: Int, y: Int, f: (Int, Int) => Int) = f(x, y)

  def combinationTest(x: Int, y: Int, f: (Int, Int) => Int): Any = {
    var c: Any = f(x, y)
    c
  }

  def tripleOp[A,B](a: A, b: A, c: A, f: (A, A, A) => B) = f(a,b,c)



}
