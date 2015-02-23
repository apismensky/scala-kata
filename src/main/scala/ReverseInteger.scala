/**
 * Complexity: Easy
 * Reverse digits of an integer.
 * <p/>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
object ReverseInteger {
  def reverse(x: Int) = {
    var abs = new StringBuilder().append(Math.abs(x.toLong)).reverse.toString().toLong
    if (abs > Integer.MAX_VALUE) abs = 0
    if (x < 0) -abs.toInt else abs.toInt
  }
}
