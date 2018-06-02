public class PathSum112 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return bfs(root, sum, 0);
    }

    private boolean bfs(TreeNode root, int sum, int addValue) {
        boolean left = false;
        boolean right = false;

        if (root.left != null) {
            left = bfs(root.left, sum, addValue + root.val);
        }
        if (root.right != null) {
            right = bfs(root.right, sum, addValue + root.val);
        }

        if (root.left == null && root.right == null && sum == addValue + root.val) {
            return true;
        }
        return left || right;
    }
}
