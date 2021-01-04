package collection

object ListArtitmatic {
  def main(args: Array[String]): Unit = {
    //test1()
    //test2()
    //test3()
    //test4()
    //test5()
    //test6()
    //test7()
    //test8()
    //test9()
    //test10()
    //test11()
    //test12()
    //test13()
    //test14()
    test15()
  }

  //::
  def test1(): Unit = {
    var data: List[Int] = List();
    data = 1 :: 2 :: Nil
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  //:::
  def test2(): Unit = {
    var data: List[Int] = List();
    data = List(1, 2) ::: List(2, 3)
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  //++
  def test3(): Unit = {
    var data: List[Int] = List();
    data = List(1, 2) ++ Set(3, 4, 3, 2, 2, 2)
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  //compare
  def test4(): Unit = {
    var data: List[Int] = List();
    println(List(1, 2) == List(1, 2))
  }

  //distinct
  def test5(): Unit = {
    var data: List[Int] = List();
    data = List(3, 5, 4, 3, 4).distinct
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  def test6(): Unit = {
    var data: List[Char] = List();
    data = List('a', 'b', 'c', 'd') drop 2
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  //filter
  def test7(): Unit = {
    var data: List[Int] = List();
    data = List(3, 5, 4, 3, 4).filter(_ > 4)
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }


  //flatern
  def test8(): Unit = {
    var data: List[Int] = List();
    data = List(List(1, 2), List(3, 4)).flatten
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  //reverse
  def test9(): Unit = {
    var data: List[Int] = List();
    data = List(1, 2, 3).reverse
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  //slice
  def test10(): Unit = {
    var data: List[Int] = List();
    data = List(2, 3, 5, 7) slice(1, 3)
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  //sortBy
  def test11(): Unit = {
    var data: List[String] = List();
    data = List("ABB", "BAAAAA") sortBy (_.size)
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }


  //sorted
  def test12(): Unit = {
    var data: List[String] = List();
    data = List("ABB", "BAAAAA").sorted
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  //splitAt
  def test13(): Unit = {
    var data = List(2, 3, 5, 7) splitAt 2
    println(data)
  }

  //take
  def test14(): Unit = {
    var data: List[Int] = List();
    data = List(2, 3, 5, 7, 11, 13) take 3
    for (i <- 0 to data.size - 1) {
      println(data(i))
    }
  }

  //sorted
  def test15(): Unit = {
    var data = List(1, 2,3,4) zip List("a", "b","c")
    println(data)
  }
}
