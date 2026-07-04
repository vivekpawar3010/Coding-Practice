public class MAY_17_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 2, 4, 1, 3 };

        int result = sol.countHillValley(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int countHillValley(int[] nums) {
        int ct = 0;
        int leftVal = nums[0];

        for (int i = 1; i < nums.length - 1; ++i) {
            if (nums[i] != nums[i + 1]) {
                if ((nums[i] > leftVal && nums[i] > nums[i + 1]) ||
                        (nums[i] < leftVal && nums[i] < nums[i + 1])) {
                    ct++;
                }
                leftVal = nums[i];
            }
        }
        return ct;
    }
}