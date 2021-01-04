package either

object SampleEitherUsingOr extends App{
  type Or[A,B] = Either[A,B]

  val l4: String Or Int = Left("better?")
  println(l4.left.get)

  var l3= Left(List(1,2,3))
  println(l3.isLeft)



}
