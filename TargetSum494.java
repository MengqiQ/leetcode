public class TargetSum494 {
    public int count = 0;
    public int findTargetSumWays(int[] nums, int S) {

        dfs(nums, 0, 0, S);
        return count;
    }
    private void dfs(int[] nums, int start, int sum, int target) {
        if (start == nums.length && sum == target) {
            count += 1;
        }
        if (start < nums.length) {
            dfs(nums, start + 1, sum + nums[start], target);
            dfs(nums, start + 1, sum - nums[start], target);
        }

    }
}
