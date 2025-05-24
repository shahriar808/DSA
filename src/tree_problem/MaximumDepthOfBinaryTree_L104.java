package tree_problem;

public class MaximumDepthOfBinaryTree_L104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree_L104 solution = new MaximumDepthOfBinaryTree_L104();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(4));
        int result = solution.maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + result);
    }
}
