package workingWithDataLiteralsValuesVariablesTypesVariablesTypes

object StringInterpolation {

  def main(args:Array[String]): Unit ={
    test1()
    test2()
    test3()
    test4()
    test5()
    test6()
    test7()
  }

  def test1()={
    val approx = 355/113f
    println(approx)
  }

  def test2()={
    val approx = 355/113f
    println("Pi, using 355/113, is about " + approx + "." )

  }

  def test3()={
    val approx = 355/113f
    println(s"Pi, using 355/113, is about $approx. test" )

  }

  def test4()={
    val item = "apple"
    var x=s"How do you like them ${item}s?"
    println(x)
  }

  def test5()={
    var s=s"Fish n chips n vinegar, ${"pepper "*3}salt"
    println(s)
  }

  def test6()={
    val item = "apple"
    var s=f"I wrote a new ${item}%.3s today"
    println(s)
  }

  def  test7()={
    val item = "apple"
    val f=f"Enjoying this $item ${355/113.0}%.5f times today"
    println(f)
  }
}
