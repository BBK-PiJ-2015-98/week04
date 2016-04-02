package sdp_excercise

object ca {

  val cup = new Cup()                             //> cup  : sdp_excercise.Cup = sdp_excercise.Cup@14fb997
  cup.add(45)                                     //> res0: Int = 45
  cup.add(-15)                                    //> res1: Int = 30
  cup.add(-50)                                    //> res2: Int = -20

  
}
class Cup {
  var percentFull = 0
  val max = 100
  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }

}