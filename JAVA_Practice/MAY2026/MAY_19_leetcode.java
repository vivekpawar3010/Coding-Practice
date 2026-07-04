public class MAY_19_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 4, 8, 6, 2, 7 };

        int result = sol.countSubarrays(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int countSubarrays(int[] nums) {
        int ct = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + nums[i + 2] == nums[i + 1] / 2.0) {
                ct++;
            }
        }
        return ct;
    }
}