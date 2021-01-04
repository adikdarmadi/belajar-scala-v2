package expressionsAndConditionals

object IfElseExpressions {


  def main(args: Array[String]): Unit = {
    println(test1())
    println(test2())
    println(test3("A"))
  }

  def test1(): Int = {
    1234
    val x = 10;
    val y = 20
    var result = 0
    if (x > y) x else y
  }

  def test2(): Int = {
    var x: Int = 10
    var y: Int = 20

    val max = x > y match {
      case true => x
      case false => y

    }
    max
  }

  def test3(input : String): String = {

    val month = input match {
      case "A"  => "January"
      case "B"  => "February"

    }
    month
  }

}
