import java.util.*;

public class JULY_7_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 34, 23, 1, 24 };

        int result = sol.minElement(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            while (nums[i] > 0) {
                sum += nums[i] % 10;
                nums[i] /= 10;
            }
            if (sum < min) {
                min = sum;
                if (min == 1)
                    return 1;
            }
        }
        return min;
    }
}