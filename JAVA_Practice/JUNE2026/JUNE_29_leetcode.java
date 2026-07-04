import java.util.*;

public class JUNE_29_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 1, 0, 1, 1, 1 };

        int result = sol.findMaxConsecutiveOnes(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            } else {
                result = Math.max(temp, result);
                temp = 0;
            }
        }
        result = Math.max(temp, result);
        return result;
    }
}
