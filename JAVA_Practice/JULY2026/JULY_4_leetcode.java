1import java.util.*;

public class JULY_4_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, -1, -2};

        int result = sol.maxSum(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        Set<Integer> uq = new HashSet<>();

        for (int num : nums) {
            uq.add(num);
        }
        int maxsum = 0;
        for (int num : uq) {
            if (num > 0) maxsum += num;
        }
        if (maxsum == 0) {
            maxsum = Integer.MIN_VALUE;
            for (int num : uq) {
                maxsum = (maxsum < num) ? num : maxsum;
            }
        }
        return maxsum;
    }
}