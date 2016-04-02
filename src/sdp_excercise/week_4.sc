package sdp_excercise

object week_4 {

//1:
val id=17                                         //> id  : Int = 17

//2:
//val id=20  id is already defined

//3:
val third= "ABC1234"                              //> third  : String = ABC1234

//4:
println (third)                                   //> ABC1234
//val third= "EFD1234"

//5
val nub=15.6                                      //> nub  : Double = 15.6
println (nub)                                     //> 15.6

//Expressions
//1
val Sky ="sunny"                                  //> Sky  : String = sunny
val Temperature=18                                //> Temperature  : Int = 18
val Cloud="partly cloudy"                         //> Cloud  : String = partly cloudy
if (Sky=="sunny" && Temperature>80) true else false
                                                  //> res0: Boolean = false
                                                  
if (Sky=="sunny" && Temperature>80 && Cloud=="partly cloudy") true else false
                                                  //> res1: Boolean = false
if (Sky=="sunny" && Temperature>80||Temperature<20 && Cloud=="partly cloudy") true else false
                                                  //> res2: Boolean = true
if (Sky=="sunny" && Temperature>80||Temperature<20 && Cloud=="partly cloudy") true else false
                                                  //> res3: Boolean = true

//Convert Fahrenheit to Celsius.
//Hint: first subtract 32, then multiply by 5/9. If you get 0, check to make sure you
//didnt do integer maths// I dont understand



def convertTo_celsius (TemperatureInFa: Double)= {
(TemperatureInFa-32)* 5/9
}                                                 //> convertTo_celsius: (TemperatureInFa: Double)Double

convertTo_celsius(32)                             //> res4: Double = 0.0

//Convert Celsius to Fahrenheit.
//Hint: first multiply by 9/5, then add 32. Use this to check your solution for the
//previous exercise.

def convertTo_Fahrenheit (TemperatureInce: Double)= {
(TemperatureInce* 9/5) +32

}                                                 //> convertTo_Fahrenheit: (TemperatureInce: Double)Double

convertTo_Fahrenheit(0)                           //> res5: Double = 32.0
                          
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


 def getSquare (x: Int)=  x*x                     //> getSquare: (x: Int)Int

val a = getSquare(3)                              //> a  : Int = 9

assert(getSquare(3)==9)

val b = getSquare(6)                              //> b  : Int = 36
assert(getSquare(6)==36)

val c = getSquare(5)                              //> c  : Int = 25
assert(getSquare(5)==25)

/*

2. Create a method isArg1GreaterThanArg2 that takes two Double arguments. Return
true if the first argument is greater than the second. Return false otherwise.
Print your answer. Satisfy the following:
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(/* fill this in */)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(/* fill this in */) */

 def isArg1GreaterThanArg2  (x: Double, y: Double)=  if (x > y) true else false
                                                  //> isArg1GreaterThanArg2: (x: Double, y: Double)Boolean
                                                  
val t2 = isArg1GreaterThanArg2(2.1, 1.2)          //> t2  : Boolean = true
assert(isArg1GreaterThanArg2(2.1, 1.2)==true)

val t1 = isArg1GreaterThanArg2(4.1, 4.12)         //> t1  : Boolean = false
assert(isArg1GreaterThanArg2(4.1, 4.12)==false)
                                                 
/*
3. Create a method manyTimesString that takes a String and an Int as arguments
and returns the String duplicated that many times. Print your answer. Satisfy
the following:
val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "Your message here")
val m2 = manyTimesString("123", 2)
assert("123123" == m2, "Your message here")*/

 def manyTimesString (x: String, y: Int)= (x*y)   //> manyTimesString: (x: String, y: Int)String
 
 val m1 = manyTimesString("abc", 3)               //> m1  : String = abcabcabc
 
 assert(m1== "abcabcabc")
 
 val m2 = manyTimesString("123", 2)               //> m2  : String = 123123
  assert(m2== "123123")
  
   
  def forecast(temp: Int): String= temp match {
																	case 100 =>"sunny"
																	case _ => "Anything"
																	}
                                                  //> forecast: (temp: Int)String
  forecast(100)                                   //> res6: String = sunny
  
     
}