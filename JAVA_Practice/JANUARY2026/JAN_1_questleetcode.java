package JAVA_Practice.JANUARY2026;
// 189. Rotate Array
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]
 

// Constraints:

// 1 <= nums.length <= 105
// -231 <= nums[i] <= 231 - 1
// 0 <= k <= 105
 

// Follow up:

// Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
// Could you do it in-place with O(1) extra space?

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;                    // handle large k
        int[] temp = new int[n];      // fixed array declaration

        int idx = n - k;

        for (int i = idx; i < n; i++) {
            temp[i - idx] = nums[i];
        }

        for (int i = 0; i < idx; i++) {
            temp[i + k] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}


public class JAN_1_questleetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        sol.rotate(nums, k);
        System.out.println(Arrays.toString(nums)); // Output: [5,6,7,1,2,3,4]
    }
}
