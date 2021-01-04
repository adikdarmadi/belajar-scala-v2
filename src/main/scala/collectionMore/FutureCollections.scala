package collectionMore

import scala.concurrent.ExecutionContext.Implicits.global

object FutureCollections {
  def main(args: Array[String]): Unit = {
//    val f = concurrent.Future {
//      println("hi")
//    }
//    println(f)

    val f = concurrent.Future {
      Thread.sleep(5000);
      println("hi")
    }

    Thread.sleep(3000);
    println("waiting")
    Thread.sleep(7000);

  }
}
