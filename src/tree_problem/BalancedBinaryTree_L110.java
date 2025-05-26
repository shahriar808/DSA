package tree_problem;

public class BalancedBinaryTree_L110 {
    public boolean isBalanced(TreeNode root) {
        int[] result = dfs(root);
        return result[0] == 1;
    }

    private int[] dfs(TreeNode node) {
        if (node == null) return new int[]{1, 0};
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        boolean isBalanced = left[0] == 1 && right[0] == 1 && Math.abs(left[1] - right[1]) <= 1;
        return new int[]{isBalanced ? 1 : 0, 1 + Math.max(left[1], right[1])};
    }

    public static void main(String[] args) {
        BalancedBinaryTree_L110 solution = new BalancedBinaryTree_L110();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(solution.isBalanced(root));
    }
}
