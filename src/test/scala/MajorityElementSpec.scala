import org.scalatest.{FlatSpec, Matchers}

class MajorityElementSpec extends FlatSpec with Matchers {
  "null" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(MajorityElement.majorityElement(null))
  }

  "empty array" should "produce IllegalArgumentException" in {
    an [IllegalArgumentException] shouldBe thrownBy(MajorityElement.majorityElement(new Array[Int](0)))
  }

  "array of one element {10}" should "return this element (10)" in {
    MajorityElement.majorityElement(Array(10)) should be(10)
  }

  "{4,5,4}" should "return 4" in {
    MajorityElement.majorityElement(Array(4,5,4)) should be(4)
  }

  "{1,3,3,1,3,4,3,2,3,3}" should "return 3" in {
    MajorityElement.majorityElement(Array(1, 3, 3, 1, 3, 4, 3, 2, 3, 3)) should be(3)
  }

}
