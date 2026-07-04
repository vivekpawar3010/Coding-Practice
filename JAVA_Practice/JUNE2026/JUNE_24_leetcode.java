import java.util.*;

public class JUNE_24_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3 };

        int[] result = sol.leftRightDifference(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }
}

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int total = 0, left = 0;
        for (int num : nums) {
            total += num;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(left - (total - left - nums[i]));
            left += nums[i];
        }
        return result;
    }
}
