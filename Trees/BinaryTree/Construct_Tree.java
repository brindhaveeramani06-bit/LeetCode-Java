import java.util.*;

class Solution {

    int preIndex = 0;

    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }


    private TreeNode build(int[] preorder, int left, int right) {

        if (left > right) {
            return null;
        }


        int value = preorder[preIndex];

        preIndex++;


        TreeNode root = new TreeNode(value);


        int inorderIndex = map.get(value);


        root.left = build(preorder, left, inorderIndex - 1);


        root.right = build(preorder, inorderIndex + 1, right);


        return root;
    }
}