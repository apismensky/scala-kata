import org.scalatest.{Matchers, FlatSpec}

class ReversePolishSpec extends FlatSpec with Matchers {

  "null argument" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(ReversePolish.calculate(null))
  }

  "empty array" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(ReversePolish.calculate(Array()))
  }

  "['1', '1', '+']" should "produce 2" in {
    ReversePolish.calculate(Array("1", "1", "+")) should be(2)
  }

  "['2', '1', '+', '3', '*'] -> ((2 + 1) * 3)" should "produce 9" in {
    ReversePolish.calculate(Array("2", "1", "+", "3", "*")) should be(9)
  }

  "['4', '15', '5', '/', '+'] -> (4 + (15 / 5))" should "produce 7" in {
    ReversePolish.calculate(Array("4", "15", "5", "/", "+")) should be(7)
  }
}
