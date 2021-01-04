package either

object SampleEitherUsingLeftProjection extends App{
  val l: Either[String, Int] = Left("boo")
  val r: Either[String, Int] = Right(12)

  println(l.left)
  println(l.right)
  println(r.left)
  println(r.right)

  println(l.left.map(_.size))
  println(l.right.map(_.toString))

  println(r.left.map(_.size))
  println(r.right.map(_.toString))
}
