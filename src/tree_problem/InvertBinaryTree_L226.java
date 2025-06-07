package tree_problem;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_L226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        return root;
    }
    public static void main(String[] args) {
        InvertBinaryTree_L226 solution = new InvertBinaryTree_L226();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println("Before Inversion:");
        printLevelOrder(root);

        TreeNode invertedRoot = solution.invertTree(root);

        System.out.println("After Inversion:");
        printLevelOrder(invertedRoot);

    }
    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        System.out.print("Level-order: ");
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        System.out.println();
    }
}
