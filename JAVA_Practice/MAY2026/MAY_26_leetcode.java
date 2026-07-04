public class MAY_26_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3 };

        int result = sol.minimumCost(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i <= 0; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    minCost = Math.min(minCost, nums[i] + nums[j] + nums[k]);
                }
            }
        }

        return minCost;
    }
}