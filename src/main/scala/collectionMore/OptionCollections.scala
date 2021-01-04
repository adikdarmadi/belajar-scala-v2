package collectionMore

object OptionCollections {
  def main(args:Array[String]): Unit ={
    var x: String = "Indeed"
    var a = Option(x)
    x = null
    var b = Option(x)
    println(s"a is defined? ${a.isDefined}")
    println(s"b is not defined? ${b.isEmpty}")

    val legit = divide(5, 2)
    println(legit)

    val illegit = divide(3, 0)
    if(illegit.isEmpty){
      println(illegit)
    }
  }

  def divide(amt: Double, divisor: Double): Option[Double] = {
    if (divisor == 0) None
     else Option(amt / divisor)

  }


}
