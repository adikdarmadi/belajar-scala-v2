package expressionsAndConditionals

object Expressions {
  def main(args: Array[String]) {
    println(test1())
    println(test2())
    println(test3())
    println(test4())

  }

  def test1() = {
    "hello"
  }

  def test2() = {
    "hel" + 'l' + "o"
  }

  def test3() = {
    val x = 5 * 20;
    val amount = x + 10
    amount
  }

  def test4() = {
    val amount = {
      val x = 5 * 20
      x + 10
    }
    amount
  }

  def test5() = {
    {
      val a = 1;
      {
        val b = a * 2;
        {
          val c = b + 4;
          c
        }
      }
      a
    }

  }
}
