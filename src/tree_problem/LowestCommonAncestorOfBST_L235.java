package tree_problem;

public class LowestCommonAncestorOfBST_L235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        TreeNode lca = root;
        if (p.val < root.val && q.val < root.val) {
            lca = lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            lca = lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
        return lca;
    }
    public static void main(String[] args) {
        LowestCommonAncestorOfBST_L235 solution = new LowestCommonAncestorOfBST_L235();

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = root.left; // 2
        TreeNode q = root.left.right; // 4

        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + (lca != null ? lca.val : "null"));
    }
}
