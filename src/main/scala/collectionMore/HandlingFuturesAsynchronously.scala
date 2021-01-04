package collectionMore

import concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object HandlingFuturesAsynchronously {
  def main(args: Array[String]): Unit = {
    val cityTemps = Future sequence Seq(
      Future(cityTemp(2.6)), Future(cityTemp(2.9))
    )

    cityTemps.onComplete {
      case Success(x) => {
        println(x)
      }
      case Failure(e) => e.printStackTrace
    }
    Thread.sleep(5000)
  }

  def f(ints: Future[Seq[Double]]): String = ints match {


    case _ => "the future has not yet completed"
  }

  def cityTemp(value:Double): Double = {
//    val url = "http://api.openweathermap.org/data/2.5/weather"
//    val cityUrl = s"$url?q=$name&appid=d89b010670f06f92bee66fad81f7e9d2"
//    val json = io.Source.fromURL(cityUrl).mkString.trim
//    val pattern = """.*"temp":([\d.]+).*""".r
//    val pattern(temp) = json
//    temp.toDouble
   value
  }


}
