/**
 * Complexity: Easy
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * I = 1
 * V = 5
 * X = 10
 * L = 50
 * C = 100
 * D = 500
 * M = 1000
 */
object RomanToInteger {
  def romanToInt(s: String) = {
    require(s != null && (!s.isEmpty), s"Invalid Input: $s")
    var result = 0
    var i = 0
    while (i < s.length) {
      var value = getRoman(s.charAt(i))
      if (i < s.length - 1) {
        val nextValue = getRoman(s.charAt(i + 1))
        if (nextValue > value) {
          value = nextValue - value
          i += 1
        }
      }
      result += value
      i += 1
    }
    result
  }

  private def getRoman(char: Char): Int = {
    char match {
        case 'I' => 1
        case 'V' => 5
        case 'X' => 10
        case 'L' => 50
        case 'C' => 100
        case 'D' => 500
        case 'M' => 1000
        case _ => throw new IllegalArgumentException(s"Illegal char $char")
    }
  }

}
