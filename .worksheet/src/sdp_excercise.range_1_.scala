package sdp_excercise

 object range_1_ {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(213); 

/*1. Create a Range object and print the step value. Create a second Range object with
a step value of 2 and then print the step value. What’s different?*/

val x= 1 to 5;System.out.println("""x  : scala.collection.immutable.Range.Inclusive = """ + $show(x ));$skip(11); 
println(x)}
}

object range_2 {

/*1. Create a Range object and print the step value. Create a second Range object with
a step value of 2 and then print the step value. What’s different?*/

/*2. Create a String object s1 (as a var) initialised to "Sally". Create a second String
object s2 (as a var) initialised to "Sally". Use s1.equals(s2) to determine if the
two Strings are equivalent. If they are, print s1 and s2 are equal, otherwise
print s1 and s2 are not equal*/


val y= 1 to 5 by 2
println(y)
}
                                        