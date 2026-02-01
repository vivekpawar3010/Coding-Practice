package FEBRUARY2026;
// 1512. Number of Good Pairs
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
// Example 2:

// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.
// Example 3:

// Input: nums = [1,2,3]
// Output: 0
 

// Constraints:

// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100

import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int result = 0;
        for(int num : nums){
            result += freq[num];
            freq[num]++;
        }
        return result;
    }
}

public class FEB_1_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,3,1,1,3};
        System.out.println(sol.numIdenticalPairs(nums)); // Output: 4
    }
}
