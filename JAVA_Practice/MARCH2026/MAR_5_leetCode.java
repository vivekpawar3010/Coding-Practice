// 283. Move Zeroes
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

// Constraints:

// 1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, size = nums.length;
        for (int j = 0; j < size; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        // for(int k = i; k < nums.length; k++){
        // nums[k] = 0;
        // }
        while (i < size) {
            nums[k] = 0;
        }
    }
}

public class MAR_5_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 0, 1, 0, 3, 12 };
        sol.moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        nums = new int[] { 0 };
        sol.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
