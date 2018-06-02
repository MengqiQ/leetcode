public class SameTree100 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && (p.val == q.val);
    }


}
