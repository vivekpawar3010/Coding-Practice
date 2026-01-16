// public 414. Third Maximum Number
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

// Example 1:

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.
// Example 2:

// Input: nums = [1,2]
// Output: 2
// Explanation:
// The first distinct maximum is 2.
// The second distinct maximum is 1.
// The third distinct maximum does not exist, so the maximum (2) is returned instead.
// Example 3:

// Input: nums = [2,2,3,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2 (both 2's are counted together since they have the same value).
// The third distinct maximum is 1.
//  1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1

import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            // Skip duplicates
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            } 
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            } 
            else if (third == null || num > third) {
                third = (long) num;
            }
        }

        // If third max exists, return it; else return max
        return (third == null) ? first.intValue() : third.intValue();
    }
}
public class JAN_16_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 2, 3, 1};
        System.out.println(sol.thirdMax(nums)); // Output: 1
    }
}