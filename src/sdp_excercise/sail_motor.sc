package sdp_excercise

object sail_motor{
  
  val sailboat = new sailboat                     //> sailboat  : sdp_excercise.sailboat = sdp_excercise.sailboat@14fb997
  val r1 = sailboat.raise()                       //> r1  : String = Sails raised
  assert(r1== "Sails raised")
}


class sailboat {
 
def raise ()= "Sails raised"
def lower ()= println ("Sails lowered")
  
}

class Motorboat extends App{
  
def start ()= println ("Motor on")
def stop ()= println ("Motor off")
  
}