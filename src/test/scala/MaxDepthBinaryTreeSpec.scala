import org.scalatest.{FlatSpec, Matchers}

class MaxDepthBinaryTreeSpec extends FlatSpec with Matchers {
  "None" should "be 0 depth" in {
    MaxDepthBinaryTree.maxDepth(null) should be(0)
  }

  "Empty" should "be 1" in {
    MaxDepthBinaryTree.maxDepth(new Node(1)) should be(1)
  }

  "Tree of 3 elements" should "have a depth of 2" in {
    MaxDepthBinaryTree.maxDepth(new Node(1, new Node(2), new Node(3))) should be(2)
  }

  "Some complex example" should "be ok" in {
    val node1 = new Node(1, new Node(2, new Node(4), new Node(5, null, new Node(6))), new Node(3, null, new Node(7)))
    MaxDepthBinaryTree.maxDepth(node1) should be(4)
  }

}
