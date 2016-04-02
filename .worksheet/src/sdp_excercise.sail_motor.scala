package sdp_excercise

object sail_motor{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  
  val sailboat = new sailboat;System.out.println("""sailboat  : sdp_excercise.sailboat = """ + $show(sailboat ));$skip(28); 
  val r1 = sailboat.raise();System.out.println("""r1  : String = """ + $show(r1 ));$skip(30); 
  assert(r1== "Sails raised")}
}


class sailboat {
 
def raise ()= "Sails raised"
def lower ()= println ("Sails lowered")
  
}

class Motorboat extends App{
  
def start ()= println ("Motor on")
def stop ()= println ("Motor off")
  
}
