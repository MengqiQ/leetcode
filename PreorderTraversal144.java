import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal144 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private List<Integer> preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return result;
        }
        result.add(root.val);
        if (root.left != null) {
            preorder(root.left, result);
        }
        if (root.right != null) {
            preorder(root.right, result);
        }
        return result;
    }
}
