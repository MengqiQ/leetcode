public class MinimumDepthofBinaryTree111 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int minDepth(TreeNode root) {
        int MinDepth = 0;
        if (root == null) {
            return MinDepth;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        MinDepth = Math.min(left, right) + 1;
        if (left == 0 || right == 0) {
            return left + right + 1;
        }else {
            return MinDepth;
        }

    }


}
