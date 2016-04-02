package sdp_excercise

object week_4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(54); 

//1:
val id=17;System.out.println("""id  : Int = """ + $show(id ));$skip(68); 

//2:
//val id=20  id is already defined

//3:
val third= "ABC1234";System.out.println("""third  : String = """ + $show(third ));$skip(22); 

//4:
println (third);$skip(41); 
//val third= "EFD1234"

//5
val nub=15.6;System.out.println("""nub  : Double = """ + $show(nub ));$skip(14); 
println (nub);$skip(36); 

//Expressions
//1
val Sky ="sunny";System.out.println("""Sky  : String = """ + $show(Sky ));$skip(19); 
val Temperature=18;System.out.println("""Temperature  : Int = """ + $show(Temperature ));$skip(26); 
val Cloud="partly cloudy";System.out.println("""Cloud  : String = """ + $show(Cloud ));$skip(52); val res$0 = 
if (Sky=="sunny" && Temperature>80) true else false;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(130); val res$1 = 
                                                  
if (Sky=="sunny" && Temperature>80 && Cloud=="partly cloudy") true else false;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(94); val res$2 = 
if (Sky=="sunny" && Temperature>80||Temperature<20 && Cloud=="partly cloudy") true else false;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(94); val res$3 = 
if (Sky=="sunny" && Temperature>80||Temperature<20 && Cloud=="partly cloudy") true else false;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(247); 

//Convert Fahrenheit to Celsius.
//Hint: first subtract 32, then multiply by 5/9. If you get 0, check to make sure you
//didnt do integer maths// I dont understand



def convertTo_celsius (TemperatureInFa: Double)= {
(TemperatureInFa-32)* 5/9
};System.out.println("""convertTo_celsius: (TemperatureInFa: Double)Double""");$skip(23); val res$4 = 

convertTo_celsius(32);System.out.println("""res4: Double = """ + $show(res$4));$skip(224); 

//Convert Celsius to Fahrenheit.
//Hint: first multiply by 9/5, then add 32. Use this to check your solution for the
//previous exercise.

def convertTo_Fahrenheit (TemperatureInce: Double)= {
(TemperatureInce* 9/5) +32

};System.out.println("""convertTo_Fahrenheit: (TemperatureInce: Double)Double""");$skip(25); val res$5 = 

convertTo_Fahrenheit(0);System.out.println("""res5: Double = """ + $show(res$5));$skip(371); 
                          
//Methods
             
/*
Methods
1. Create a method getSquare that takes an Int argument and returns its square.
Print your answer. Test using the following code.
val a = getSquare(3)
assert(/* fill this in */)
val b = getSquare(6)
assert(/* fill this in */)
val c = getSquare(5)
assert(/* fill this in */) */


 def getSquare (x: Int)=  x*x;System.out.println("""getSquare: (x: Int)Int""");$skip(22); 

val a = getSquare(3);System.out.println("""a  : Int = """ + $show(a ));$skip(25); 

assert(getSquare(3)==9);$skip(22); 

val b = getSquare(6);System.out.println("""b  : Int = """ + $show(b ));$skip(25); 
assert(getSquare(6)==36);$skip(22); 

val c = getSquare(5);System.out.println("""c  : Int = """ + $show(c ));$skip(25); 
assert(getSquare(5)==25);$skip(428); 

/*

2. Create a method isArg1GreaterThanArg2 that takes two Double arguments. Return
true if the first argument is greater than the second. Return false otherwise.
Print your answer. Satisfy the following:
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(/* fill this in */)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(/* fill this in */) */

 def isArg1GreaterThanArg2  (x: Double, y: Double)=  if (x > y) true else false;System.out.println("""isArg1GreaterThanArg2: (x: Double, y: Double)Boolean""");$skip(93); 
                                                  
val t2 = isArg1GreaterThanArg2(2.1, 1.2);System.out.println("""t2  : Boolean = """ + $show(t2 ));$skip(46); 
assert(isArg1GreaterThanArg2(2.1, 1.2)==true);$skip(43); 

val t1 = isArg1GreaterThanArg2(4.1, 4.12);System.out.println("""t1  : Boolean = """ + $show(t1 ));$skip(48); 
assert(isArg1GreaterThanArg2(4.1, 4.12)==false);$skip(437); 
                                                 
/*
3. Create a method manyTimesString that takes a String and an Int as arguments
and returns the String duplicated that many times. Print your answer. Satisfy
the following:
val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "Your message here")
val m2 = manyTimesString("123", 2)
assert("123123" == m2, "Your message here")*/

 def manyTimesString (x: String, y: Int)= (x*y);System.out.println("""manyTimesString: (x: String, y: Int)String""");$skip(38); 
 
 val m1 = manyTimesString("abc", 3);System.out.println("""m1  : String = """ + $show(m1 ));$skip(28); 
 
 assert(m1== "abcabcabc");$skip(38); 
 
 val m2 = manyTimesString("123", 2);System.out.println("""m2  : String = """ + $show(m2 ));$skip(24); 
  assert(m2== "123123");$skip(148); 
  
   
  def forecast(temp: Int): String= temp match {
																	case 100 =>"sunny"
																	case _ => "Anything"
																	};System.out.println("""forecast: (temp: Int)String""");$skip(16); val res$6 = 
  forecast(100);System.out.println("""res6: String = """ + $show(res$6))}
  
     
}
