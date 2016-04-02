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

object vectorss {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(823); 
  println("Welcome to the Scala worksheet");$skip(24); 
  
  var numbers_0 = "";System.out.println("""numbers_0  : String = """ + $show(numbers_0 ));$skip(23); 
  val A= Vector(1,2,3);System.out.println("""A  : scala.collection.immutable.Vector[Int] = """ + $show(A ));$skip(30); 

  val B= Vector("a","b","c");System.out.println("""B  : scala.collection.immutable.Vector[String] = """ + $show(B ));$skip(22); 
  B.foreach (println);$skip(39); 
  val C= Vector("Tee","Teemerte","TT");System.out.println("""C  : scala.collection.immutable.Vector[String] = """ + $show(C ));$skip(49); 
 for (names <- C) numbers_0 =  numbers_0 + names;$skip(20); 
 println(numbers_0);$skip(32); 
 
  val d= Vector("Tee",1,"TT");System.out.println("""d  : scala.collection.immutable.Vector[Any] = """ + $show(d ));$skip(27); 
  val e= Vector("Tee",1,d);System.out.println("""e  : scala.collection.immutable.Vector[Any] = """ + $show(e ))}
}
