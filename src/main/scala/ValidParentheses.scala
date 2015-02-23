import scala.collection.mutable

/**
 * Complexity: Easy
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid
 but "(]" and "([)]" are not.
 */
object ValidParentheses {

  def isValid(s: String) = {
    require(s != null, "Can not pass null")
    val stack = new mutable.Stack[Char]
    for (c <- s.toCharArray) {
        if (stack.isEmpty)
          stack.push(c)
        else {
          if (isMatch(stack.top, c)) stack.pop()
          else stack.push(c)
        }
    }
    stack.isEmpty
  }

  private def isMatch(l: Char, r: Char) = l == '{' && r == '}' ||  l == '(' && r == ')' || l == '[' && r == ']'

}
