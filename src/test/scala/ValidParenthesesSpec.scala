import org.scalatest.{Matchers, FlatSpec}

class ValidParenthesesSpec extends FlatSpec with Matchers  {
  "null argument" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(ValidParentheses.isValid(null))
  }

  "empty string" should "be valid" in {
    ValidParentheses.isValid("") should be(true)
  }

  "other chars" should "be invalid" in {
    ValidParentheses.isValid("ABC") should be(false)
  }

  "two matching {}" should "be valid" in {
    ValidParentheses.isValid("{}") should be(true)
  }

  "one parenthesis {" should "be invalid" in {
    ValidParentheses.isValid("{") should be(false)
  }

  "()[]{}" should "be valid" in {
    ValidParentheses.isValid("()[]{}") should be(true)
  }

  "{()[{}]}" should "be valid" in {
    ValidParentheses.isValid("{()[{}]}") should be(true)
  }

  "{([{})]}" should "be invalid" in {
    ValidParentheses.isValid("{([{})]}") should be(false)
  }

  "([)]" should "be invalid" in {
    ValidParentheses.isValid("([)]") should be(false)
  }

}
