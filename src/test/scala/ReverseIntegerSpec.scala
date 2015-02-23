import org.scalatest.{Matchers, FlatSpec}

class ReverseIntegerSpec extends FlatSpec with Matchers {
  "0" should "be 0" in {
    ReverseInteger.reverse(0) should be(0)
  }

  "1" should "be 1" in {
    ReverseInteger.reverse(1) should be(1)
  }

  "-1" should "be -1" in {
    ReverseInteger.reverse(-1) should be(-1)
  }

  "-10" should "be -1" in {
    ReverseInteger.reverse(-10) should be(-1)
  }

  "12" should "be 21" in {
    ReverseInteger.reverse(12) should be(21)
  }

  "1534236469" should "be 0" in {
    ReverseInteger.reverse(1534236469) should be(0)
  }
}
