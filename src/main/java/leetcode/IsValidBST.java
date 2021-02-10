package leetcode;

import datastruct.TreeNode;

public class IsValidBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode one = new TreeNode(4);
        TreeNode two = new TreeNode(1);
        TreeNode three = new TreeNode(7);
        TreeNode four = new TreeNode(8);
        root.left = one;
        one.left = two;
        one.right = three;
        root.right = four;
        isValidBST(root);
    }
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public static boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if(root == null) return true;
        if(min != null && root.val <= min) return false;
        if(max != null && root.val >= max) return false;
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
