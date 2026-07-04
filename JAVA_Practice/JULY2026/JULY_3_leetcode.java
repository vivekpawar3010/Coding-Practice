1import java.util.*;

public class JULY_3_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 4, 5, 2};

        int result = sol.maxProduct(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] - 1) * (nums[j] - 1) > max) max = (nums[i] - 1) * (nums[j] - 1);
            }
        }
        return max;
    }
}