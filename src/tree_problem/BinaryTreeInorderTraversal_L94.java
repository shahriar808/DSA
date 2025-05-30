package tree_problem;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_L94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        BinaryTreeInorderTraversal_L94 solution = new BinaryTreeInorderTraversal_L94();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result); // Output: [1, 3, 2]
    }
}
