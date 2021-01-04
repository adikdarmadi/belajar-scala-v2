package collectionMore

object Arrays {
  def main(args:Array[String]): Unit ={
    val colors = Array("red", "green", "blue")
    colors(0) = "purple"
    for(i<- 0 to colors.size-1){
      print(colors(i)+',')
    }
  }
}
