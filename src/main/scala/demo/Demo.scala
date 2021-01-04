package demo

object Demo {
  def main(args: Array[String]){
    var a : Integer=10;
    print(a);

    var name="adik";
    var umur=20;

    //string interpolation
    println(s" nama $name umur $umur")

    val s: String = identity[String]("Hello")
    println(s);

    val x: Int = 5;
    println(x);

    //Tuples
    val info = (5, "Korben", true)
    println(info);
    var data=info._3
    println(data);


    val x1 = 100; val y1 = 20

    val max = x1 > y1 match {
     case true => x1
         case false => y1
         }
    println(max)

  }

  def identity[A](a: A): A = a
}
