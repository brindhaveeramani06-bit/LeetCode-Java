class Solution {

    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        depth(root);

        return diameter;
    }

    private int depth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}