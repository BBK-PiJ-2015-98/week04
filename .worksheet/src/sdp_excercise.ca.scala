package sdp_excercise

object ca {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 

  val cup = new Cup();System.out.println("""cup  : sdp_excercise.Cup = """ + $show(cup ));$skip(14); val res$0 = 
  cup.add(45);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  cup.add(-15);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  cup.add(-50);System.out.println("""res2: Int = """ + $show(res$2))}

  
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
