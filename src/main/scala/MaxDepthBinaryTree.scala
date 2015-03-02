/**
  * Given a binary tree, find its maximum depth.
  * The maximum depth is the number of nodes along the longest path
  * from the root node down to the farthest leaf node.
  *
  *                      1
  *                     / \
  *                    2  3
  *                   / \  \
  *                  4  5  7
  *                      \
  *                      6
  *                      ↑ (4)
  */
object MaxDepthBinaryTree {
  def maxDepth(n: Node): Int = {
    if (n == null) return 0
    Math.max(maxDepth(n.left) + 1, maxDepth(n.right) + 1)
  }
}

case class Node(value: Int, left: Node, right: Node) {
  def this(value: Int) = this(value, null, null)
}
