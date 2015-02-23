import scala.collection.mutable

/**
 * Complexity: Medium
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * I = 1
 * V = 5
 * X = 10
 * L = 50
 * C = 100
 * D = 500
 * M = 1000
 */
object IntegerToRoman {
  def intToRoman(n: Int) = {
    require(n > 0 && n < 4000, s"Number $n is outside of the range. Valid range is from 1 to 3999")
    val result = new StringBuilder
    var position = 0
    var num = n
    while (num > 0) {
      val digit = num % 10
      num = num / 10
      result.insert(0, getRoman(position, digit))
      position += 1
    }
    result.toString()
  }

  /**
   * Get all Roman symbols that represents the digit at the certain position
   * @param position position of the digit, from right to left, starting from 0
   * @param digit digit
   * @return String of Roman numbers representation
   */
  private def getRoman(position: Int, digit: Int) = {
    val rl = getRomanSymbols(position)
    val digitRoman = new mutable.StringBuilder
    digit match {
      case 1 | 2 | 3 => 1 to digit foreach { _ => digitRoman.append(rl._1)}
      case 4 => digitRoman.append(rl).append(rl._2)
      case 5 | 6 | 7 | 8 =>
        digitRoman.append(rl._2)
        1 to digit - 5 foreach { _ => digitRoman.append(rl._1)}
      case 9 => digitRoman.append(rl._1).append(rl._3)
      case 0 =>
      case _ => throw new IllegalStateException(s"Illegal digit $digit")
    }
    digitRoman.toString()
  }

  /**
   * Returns all possible digits that is used for current position
   * @param pow10 position in the number, that matches to  Math.pow(10, N)
   * @return tuple that contains digits for Roman number 0
   */
  private def getRomanSymbols(pow10: Int) = {
    pow10 match {
      case 0 => ("I", "V", "X")
      case 1 => ("X", "L", "C")
      case 2 => ("C", "D", "M")
      case 3 => ("M", null, null)
      case _ => throw new IllegalArgumentException(s"Number of digits is not supported $pow10")
    }
  }
}
