package tree_problem;

public class IncreasingOrderSearchTree_L897 {
    private TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        current = dummy;
        inorder(root);
        return dummy.right;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        node.left = null;
        current.right = node;
        current = node;
        inorder(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        IncreasingOrderSearchTree_L897 solution = new IncreasingOrderSearchTree_L897();
        TreeNode result = solution.increasingBST(root);

        printInOrder(result); // Expected output: 1 2 3 4 5 6
    }

    private static void printInOrder(TreeNode result) {
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.right;
        }
    }
}
