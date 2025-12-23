// 268. Missing Number
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

// Example 1:

// Input: nums = [3,0,1]

// Output: 2

// Explanation:

// n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

// Example 2:

// Input: nums = [0,1]

// Output: 2

// Explanation:

// n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

// Example 3:

// Input: nums = [9,6,4,2,3,5,7,0,1]

// Output: 8

// Explanation:

// n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.



class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Create an array of size n+1 initialized with 0
        int[] check = new int[n + 1];
        
        // Mark existing numbers
        for (int num : nums) {
            check[num] = 1;
        }
        
        // Find the missing number
        for (int i = 0; i <= n; i++) {
            if (check[i] == 0) {
                return i;
            }
        }
        
        return -1; // safety return (won't happen)
    }
}


public class DEC_18_questleetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test Case 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Test 1 - Input: [3, 0, 1]");
        System.out.println("Output: " + sol.missingNumber(nums1)); // Expected: 2
        
        // Test Case 2
        int[] nums2 = {0, 1};
        System.out.println("\nTest 2 - Input: [0, 1]");
        System.out.println("Output: " + sol.missingNumber(nums2)); // Expected: 2
        
        // Test Case 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("\nTest 3 - Input: [9, 6, 4, 2, 3, 5, 7, 0, 1]");
        System.out.println("Output: " + sol.missingNumber(nums3)); // Expected: 8
    }
}

