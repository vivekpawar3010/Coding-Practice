import java.util.*;

public class JUNE_22_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 2, 3, 1, 1, 4 };

        boolean result = sol.canJump(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public boolean canJump(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (idx < i)
                return false;
            idx = max(idx, i + nums[i]);
        }
        return true;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
