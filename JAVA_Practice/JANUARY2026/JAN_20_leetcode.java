// 34. Find First and Last Position of Element in Sorted Array
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109

import java.util.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length == 0) return result; // if given array is empty

        int low = 0, high = nums.length - 1;
        // use binary search to find one occurence
        while(low <= high){
            int mid =  low + (high - low) / 2;
            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else {
                result[0] = mid;
                result[1] = mid;
                break;
            }
        }
        if (result[0] == -1) return result; // if target value not found
        

        // to track the frist index
        int i = result[0] - 1;
        while(i >= 0 && nums[i] == target){
            result[0] = i;
            i--;
        }

        //to track the  last index
        i = result[1] + 1;
        while(i < nums.length && nums[i] == target) {
            result[1] = i;
            i++;
        }

        return result;
    }
}
public class JAN_20_leetcode {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {5, 7, 8, 8, 10};
        int target = 8;
        int[] result = sol.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}


