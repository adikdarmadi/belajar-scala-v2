package collection

object PatternMatchingWithCollections {
  def main(args: Array[String]): Unit = {
    test()
  }

  def test(): Unit = {
    val statuses = List(500, 404)
    val msg1 = statuses.head match {
      case x if x < 500 => "okay"
      case _ => "whoah, an error"
    }
    println(msg1)

    val msg2 = statuses match {
      case x if x contains (100) => "has error"
      case _ => "okay"
    }
    println(msg2)

    val msg3 = statuses match {
      case List(404, 500) =>{
        "not found & error"
      }
      case List(500, 404) => "error & not found"
      case List(200, 200) => "okay"
      case _ => "not sure what happened"
    }
    println(msg3)
  }
}
