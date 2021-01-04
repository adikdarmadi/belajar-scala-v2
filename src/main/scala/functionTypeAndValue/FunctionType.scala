package functionTypeAndValue

object FunctionType {
  def main(args:Array[String]): Unit ={

    println("echo "+myDouble)

    println(myDouble(4))

  }

  val myDouble: (Int) => Int = doubleFungsi
  def doubleFungsi(x:Int): Int=x*2
}
