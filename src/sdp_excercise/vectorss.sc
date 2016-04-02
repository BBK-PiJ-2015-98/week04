package sdp_excercise

/*1. Use the REPL to create several Vectors, each populated by a different type of data.
2. Use the REPL to see if you can make a Vector containing other Vectors.
3. Create a Vector and populate it with words (which are Strings). Add a for loop
that prints each element in the Vector. Append to a variable of type String to
create a sentence. Satisfy the following test:
sentence.toString() is "The dog visited the fire station "
4. Create and initialise two Vectors, one containing Ints and one containing Doubles.
Call the sum, min, and max operations on each one.
5. Create two Vectors of Int named myVector1 and myVector2, each initialised to
1, 2, 3, 4, 5, 6. Use AtomicTest to show whether the two are equivalent.

Not Finished

*/

object vectorss {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var numbers_0 = ""                              //> numbers_0  : String = ""
  val A= Vector(1,2,3)                            //> A  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)

  val B= Vector("a","b","c")                      //> B  : scala.collection.immutable.Vector[String] = Vector(a, b, c)
  B.foreach (println)                             //> a
                                                  //| b
                                                  //| c
  val C= Vector("Tee","Teemerte","TT")            //> C  : scala.collection.immutable.Vector[String] = Vector(Tee, Teemerte, TT)
 for (names <- C) numbers_0 =  numbers_0 + names
 println(numbers_0)                               //> TeeTeemerteTT
 
  val d= Vector("Tee",1,"TT")                     //> d  : scala.collection.immutable.Vector[Any] = Vector(Tee, 1, TT)
  val e= Vector("Tee",1,d)                        //> e  : scala.collection.immutable.Vector[Any] = Vector(Tee, 1, Vector(Tee, 1,
                                                  //|  TT))
}