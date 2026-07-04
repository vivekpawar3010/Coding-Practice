1import java.util.*;

public class JULY_1_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4};

        int result = sol.maxAdjacentDistance(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int diff = abs(nums[i] - nums[(i + 1) % n]);
            max = (max < diff) ? diff : max;
        }
        return max;
    }

    private int abs(int n) {
        return (n > 0) ? n : -n;
    }
}