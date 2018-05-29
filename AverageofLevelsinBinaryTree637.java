import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree637 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return result;
        }
        queue.add(root);

        int qsize;
        TreeNode t;
        while (!queue.isEmpty()) {
            qsize = queue.size();
            int stored = qsize;
            double sum = 0.0;
            while ((qsize --) > 0) {
                t = queue.poll();
                sum += t.val;
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            result.add(sum/(double)stored);

        }

        return result;
    }

    public static void main(String[] args) {
        AverageofLevelsinBinaryTree637 averageofLevels = new AverageofLevelsinBinaryTree637();

    }
}
