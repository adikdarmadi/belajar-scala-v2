//The Stream type is a lazy collection, generated from one or more starting elements and
//a recursive function. Elements are added to the collection only when they are accessed
//for the first time, in constrast to other immutable collections that receive 100% of their
//contents at instantiation time. The elements that a stream generates are cached for later
//retrieval, ensuring that each element is only generated once. Streams can be unbounded,
//theoretically infinite collections where elements are only realized upon access. They can
//also be terminated with Stream.Empty, a counterpart to List.Nil.
//Streams, like lists, are recursive data structures consisting of a head (the current element)
//and a tail (the rest of the collection). They can be built with a function that returns a
//new stream containing the head element and a recursive invocation of that function to
//build the tail. You can use Stream.cons to construct a new stream with the head
//and tail.
//Here is an example function that builds and recursively generates a new stream. By
//incrementing the starting integer value, it will end up creating a collection of consecu‐
//tively increasing integers:

package collectionMore

object Streams {
    def main(args:Array[String]): Unit ={
        val s = inc(1)
        s.take(5).toList
        println(s)
    }

    def inc(i: Int): Stream[Int] = Stream.cons(i, inc(i+1))
}
