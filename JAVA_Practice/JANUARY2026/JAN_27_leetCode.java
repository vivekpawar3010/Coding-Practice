// 2529. Maximum Count of Positive Integer and Negative Integer
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

// In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
// Note that 0 is neither positive nor negative.

 

// Example 1:

// Input: nums = [-2,-1,-1,1,2,3]
// Output: 3
// Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
// Example 2:

// Input: nums = [-3,-2,-1,0,0,1,2]
// Output: 3
// Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
// Example 3:

// Input: nums = [5,20,66,1314]
// Output: 4
// Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
 

// Constraints:

// 1 <= nums.length <= 2000
// -2000 <= nums[i] <= 2000
// nums is sorted in a non-decreasing order.


import java.util.Arrays;
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int l = 0, h = n - 1;
        
        // Binary Search
        while(l <= h){
            int m = l + (h - l) / 2;
            if(nums[m] > 0){
                h = m - 1;
            } else if(nums[m] < 0){
                l = m + 1;
            } else {
                // If we found a zero, set l and h to it and break
                l = m;
                h = m;
                break;
            }
        }
        
        int negCount = 0;
        int posCount = 0;

        // Check if we actually landed on a zero (l <= h implies we hit the 'break')
        if(l <= h && nums[l] == 0){
            // Expand l to the left to find the last negative
            while(l >= 0 && nums[l] == 0){
                l--;
            }
            negCount = l + 1;

            // Expand h to the right to find the first positive
            while(h < n && nums[h] == 0){
                h++;
            }
            posCount = n - h;
        } 
        else {
            // No zero found: l and h have crossed (l > h)
            // h is at the last negative, l is at the first positive
            negCount = h + 1;
            posCount = n - l;
        }

        return Math.max(negCount, posCount);
    }
}


package JAVA_Practice;

public class JAN_27_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-2,-1,-1,1,2,3};
        int result = sol.maximumCount(nums);
        System.out.println(result);
    }     
}
