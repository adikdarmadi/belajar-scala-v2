package workingWithDataLiteralsValuesVariablesTypesVariablesTypes

object Naming {
  def main(args: Array[String]) {
    val π = 3.14159

    val $ = "USD currency symbol"

    val o_O = "Hmm"

//    error penamaan tidak boleh menggunakan spasi
//    val 50 cent = "$0.50"(2)

//    error
//    val a.b = 25
//    val a.b = 25

    val `a.b` = 4
    println(`a.b`)


  }
}
