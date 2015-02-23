import org.scalatest.{Matchers, FlatSpec}

class IntegerToRomanSpec extends FlatSpec with Matchers {
  "0" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(IntegerToRoman.intToRoman(0))
  }

  "4000" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(IntegerToRoman.intToRoman(4000))
  }

  "1" should "be I" in {
    IntegerToRoman.intToRoman(1) should be("I")
  }

  "5" should "be V" in {
    IntegerToRoman.intToRoman(5) should be("V")
  }

  "10" should "be X" in {
    IntegerToRoman.intToRoman(10) should be("X")
  }

  "50" should "be L" in {
    IntegerToRoman.intToRoman(50) should be("L")
  }

  "1000" should "be M" in {
    IntegerToRoman.intToRoman(1000) should be("M")
  }

  "1100" should "be MC" in {
    IntegerToRoman.intToRoman(1100) should be("MC")
  }

  "2" should "be II" in {
    IntegerToRoman.intToRoman(2) should be("II")
  }

  "3098" should "be MMMXCVIII" in {
    IntegerToRoman.intToRoman(3098) should be("MMMXCVIII")
  }

  "3999" should "be MMMCMXCIX" in {
    IntegerToRoman.intToRoman(3999) should be("MMMCMXCIX")
  }
}
