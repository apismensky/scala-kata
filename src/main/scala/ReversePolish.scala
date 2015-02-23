import scala.collection.mutable

/**
 * Complexity: Medium
 *
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p/>
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p/>
 * Some examples:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */


object ReversePolish {

  def calculate (args: Array[String]) = {
    require(args != null && args.length > 0, "Can not pass null or empty array")
    val stack = new mutable.Stack[Int]
    for (arg <- args) {
        getOperation(arg) match {
          case Some(function) => { // Perform operation
            val first = stack.pop()
            val second = stack.pop()
            stack.push(function(second, first))
          }
          case None => stack.push(arg.toInt)  // Put number in the stack
        }
    }
    stack.pop()
  }

  def getOperation(sign: String): Option[(Int, Int) => Int] = {
    sign match {
      case "+" => Some(_ + _)
      case "-" => Some(_ - _)
      case "*" => Some(_ * _)
      case "/" => Some(_ / _)
      case _ => None
    }
  }
}
