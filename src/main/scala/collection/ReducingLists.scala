package collection

object ReducingLists {
  def main(args: Array[String]): Unit = {
    max()
    min()
    product()
    sum()
  }

  def max(): Unit = {
    var data : Int=List(41, 59, 26).max
    println(data)
  }

  def min(): Unit = {
    var data : Int=List(41, 59, 26).min
    println(data)
  }

  def product(): Unit ={
    var data : Int=List(1, 2, 3,4).product
    println(data)
  }

  def sum(): Unit ={
    var data : Int=List(1, 2, 3,4).sum
    println(data)
  }
}
