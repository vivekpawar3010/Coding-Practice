// 1913. Maximum Product Difference Between Two Pairs
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

// For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
// Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

// Return the maximum such product difference.

// Example 1:

// Input: nums = [5,6,2,7,4]
// Output: 34
// Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
// The product difference is (6 * 7) - (2 * 4) = 34.
// Example 2:

// Input: nums = [4,2,5,9,7,4,8]
// Output: 64
// Explanation: We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
// The product difference is (9 * 8) - (2 * 4) = 64.

// Constraints:

// 4 <= nums.length <= 104
// 1 <= nums[i] <= 104

class Solution {
    final int MAX = Integer.MAX_VALUE;

    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        if (n < 4)
            return 0;
        int a = MAX, b = MAX, c = 0, d = 0;
        for (int num : nums) {
            if (num < b) {
                if (num < a) {
                    b = a;
                    a = num;
                } else
                    b = num;
            }
            if (num > c) {
                if (num > d) {
                    c = d;
                    d = num;
                } else
                    c = num;
            }
        }
        // if(a > 0) return c;
        return (c * d) - (a * b);
    }
}

public class JULY_18_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 5, 6, 2, 7, 4 };

        int result = sol.maxProductDifference(nums);
        System.out.println("Result: " + result);
    }
}
