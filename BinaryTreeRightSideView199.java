import java.util.*;

public class BinaryTreeRightSideView199 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if (root == null) {
            return result;
        }
        TreeNode t;
        queue.add(root);
        while (!queue.isEmpty()) {
            int qsize = queue.size();

            while (qsize > 0 ) {
                t = queue.poll();
                qsize --;
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
                if (qsize == 0) {
                    result.add(t.val);
                }


            }


        }
        return result;

    }
    public static void main(String[] args) {
        BinaryTreeRightSideView199 bt = new BinaryTreeRightSideView199();

    }
}
