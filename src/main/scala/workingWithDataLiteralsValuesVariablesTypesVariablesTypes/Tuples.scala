package workingWithDataLiteralsValuesVariablesTypesVariablesTypes

object Tuples {
  def main (args:Array[String])={
    test1()
    test2()
  }

  def test1()={
    val info = (5, "Korben", true)
    println(info._1)
    println(info._2)
    println(info._3)
  }

  def test2()={
    val red = "red" -> "0xff0000"
    println(red._1)

    val reversed = red._2 -> red._1
    println(reversed._1)
    println(reversed._2)
  }
}
