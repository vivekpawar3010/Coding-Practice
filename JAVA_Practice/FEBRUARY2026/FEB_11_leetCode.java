// 209. Minimum Size Subarray Sum
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0

// Constraints:

// 1 <= target <= 109
// 1 <= nums.length <= 105
// 1 <= nums[i] <= 104

// Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).

import java.util.*;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        long sum = 0;
        int minl = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum >= target) {
                minl = Math.min(minl, r - l + 1);
                sum -= nums[l];
                ++l;
            }
        }

        return (minl == Integer.MAX_VALUE) ? 0 : minl;
    }
}

public class FEB_11_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(sol.minSubArrayLen(target, nums)); // Output: 2
    }
