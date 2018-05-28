import javax.swing.tree.TreeNode;
import java.util.Arrays;





public class sortedArrayToBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

        public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return null;
        }
        return arrayToBST(nums, 0, nums.length - 1);

    }

    private TreeNode arrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = arrayToBST(nums, start, mid);
        node.right = arrayToBST(nums, mid, end);

        return node;

    }





    public static void main(String[] args) {
        sortedArrayToBST sort = new sortedArrayToBST();
        int[] A = new int[]{-10,-3,0,5,9};
//        System.out.println(1);
        sort.sortedArrayToBST(A);

    }
}
