package collectionMore

object SeqAndSequences {
    def main(args:Array[String]): Unit ={
      val inks = Seq('C','M','Y','K')
      println(inks)

      val hi = "Hello, " ++ "worldly" take 12 replaceAll ("w","W")
      println(hi)
    }
}
