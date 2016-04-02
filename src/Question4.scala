
import com.atomicscala.AtomicTest._

// I'm not sure what is required

/*What happens in Cups add method if increase is a negative value? Is any additional
code necessary to satisfy the following tests:
val cup = new Cup
cup.add(45) is 45
cup.add(-15) is 30
cup.add(-50) is -20
Remember to include the AtomicTest class which you will find it under the atomicscala
folder in the repo. You will need to import the methods from the class using the
following statement:
import com.atomicscala.AtomicTest._
*/

object main extends App {

  val cup = new Cup()
  val A = cup.add(45) is 45
  
  val B = cup.add(-15) is 30
  val C = cup.add(-50) is -20

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