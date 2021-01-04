package functionTypeAndValue

object PartialFunctions {
    def main(args:Array[String]): Unit ={
      val statusHandler: Int => String = {
         case 200 => "Okay"
         case 400 => "Your Error"
         case 500 => "Our error"
         }
      println(statusHandler(200))
      println(statusHandler(400))
      println(statusHandler(401))

    }
}
