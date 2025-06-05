package tree_problem;

public class DiameterOfBinaryTree_L543 {
    private int maxDiameter = 0;

    private int height(TreeNode node) {
        if (node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree_L543 solution = new DiameterOfBinaryTree_L543();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int diameter = solution.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + diameter); // Output: 3
    }
}
