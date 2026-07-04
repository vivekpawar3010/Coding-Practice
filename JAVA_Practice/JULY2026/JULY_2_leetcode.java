1import java.util.*;

public class JULY_2_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {7, 1, 5, 3, 6, 4};

        int result = sol.maximumDifference(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[i] > max) max = nums[j] - nums[i];
            }
        }
        return max != 0 ? max : -1;
    }
}