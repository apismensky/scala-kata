import org.scalatest.{Matchers, FlatSpec}

class RomanToIntegerSpec extends FlatSpec with Matchers {

  "null" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(RomanToInteger.romanToInt(null))
  }

  "empty string" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(RomanToInteger.romanToInt(""))
  }

  "illegal character" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(RomanToInteger.romanToInt("QQQ"))
  }

  "I" should "be 1" in {
    RomanToInteger.romanToInt("I") should be(1)
  }

  "V" should "be 5" in {
    RomanToInteger.romanToInt("V") should be(5)
  }

  "X" should "be 10" in {
    RomanToInteger.romanToInt("X") should be(10)
  }

  "L" should "be 50" in {
    RomanToInteger.romanToInt("L") should be(50)
  }

  "C" should "be 100" in {
    RomanToInteger.romanToInt("C") should be(100)
  }

  "D" should "be 500" in {
    RomanToInteger.romanToInt("D") should be(500)
  }

  "M" should "be 1000" in {
    RomanToInteger.romanToInt("M") should be(1000)
  }

  "II" should "be 2" in {
    RomanToInteger.romanToInt("II") should be(2)
  }


  "IV" should "be 4" in {
    RomanToInteger.romanToInt("IV") should be(4)
  }

  "DC" should "be 600" in {
    RomanToInteger.romanToInt("DC") should be(600)
  }

  "MMMCMXCIX" should "be 3999" in {
    RomanToInteger.romanToInt("MMMCMXCIX") should be(3999)
  }
}
