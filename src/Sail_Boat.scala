  /*1. Create a Sailboat class with methods to raise and lower the sails, printing Sails
raised, and Sails lowered, respectively.
Create a Motorboat class with methods to start and stop the motor, returning
Motor on, and Motor off, respectively. Create an object (instance) of the
Sailboat class. Use assert for verification:
val sailboat = new Sailboat
val r1 = sailboat.raise()
assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
val r2 = sailboat.lower()
assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
val motorboat = new Motorboat
val s1 = motorboat.on()
assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
val s2 = motorboat.off()
assert(s2 == "Motor off", "Expected Motor off, Got " + s2)

*/


/*2. Create a new class Flare. Define a light method in the Flare class. Satisfy the
following:
val flare = new Flare
val f1 = flare.light
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)*/

/* 3. In each of the Sailboat and Motorboat classes, add a method signal that creates
a Flare object and calls the light method on the Flare. Satisfy the following:
val sailboat2 = new Sailboat2
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
Page 3
val motorboat2 = new Motorboat2
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)*/

//check Assert 


object sail_motor extends App{
  
  val sailboat = new Sailboat()
  val r1 = sailboat.raise()
  assert (r1=="Sails raised" , "Expected Sails raised, Got " + r1)
  val r2 = sailboat.lower()
 // assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
  val motorboat = new Motorboat
  val s1 = motorboat.on()
  //assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
  val s2 = motorboat.off()
  //assert(s2 == "Motor off", "Expected Motor off, Got " + s2)
  
  val flare = new Flare
  val f1 = flare.light
  //assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
  
  val sailboat2 = new Sailboat()
  
}


class Sailboat () extends Flare (){
  
def raise () = "Sails raised"
def lower ()= "Sails lowered"
def signal(flare: Flare)= flare.light()


  
}

class Motorboat{
  
def on ()= println ("Motor on")
def off ()= println ("Motor off") 
  
}


class Flare {
  def light()= println ("Flare used")
}
