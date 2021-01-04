package loop



object ValueBinding {
  def main(args: Array[String]): Unit = {
    var stringKalimat="Hallo , selamat , sore"
    var powersOf2 = Array("adik", "darmadi")
    var dataString=stringKalimat.split(',')
    for(c<-0 to dataString.length-1){
      powersOf2=powersOf2:+dataString(c)
    }


    powersOf2=powersOf2 ++ Vector("desi","Les")
    for(x <- 0 to powersOf2.size-1){
      println(powersOf2(x))
    }
  }
}
