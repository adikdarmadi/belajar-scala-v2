package workingWithDataLiteralsValuesVariablesTypesVariablesTypes

object NumericDataTypes {
  def main(args: Array[String]) {
    test1()
    test2()
    test3()
    test4()
    var contohRetunDouble = test5()
    println(contohRetunDouble)
  }

  def test1() {
    val b: Byte = 10

    val s: Short = b

    val d: Double = s
  }

  def test2() {
    val l: Long = 20

    //    error
    //    val i: Int = l
    //    <console>:8: error: type mismatch;
    //      found   : Long
    //      required: Int
    val i: Int = l.intValue()
  }

  def test3() {
    val l: Long = 20

    val i: Int = l.toInt
  }

  def test4() {
    val anInt = 5

    val yellowRgb = 0xffff00

    val id = 100l

    val pi = 3.1416


  }

  //akan mereturn nilai double
  def test5() = {
    3.1416
  }
}
