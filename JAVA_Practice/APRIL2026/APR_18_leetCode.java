//     3079. Find the Sum of Encrypted Integers
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given an integer array nums containing positive integers. We define a function encrypt such that encrypt(x) replaces every digit in x with the largest digit in x. For example, encrypt(523) = 555 and encrypt(213) = 333.

// Return the sum of encrypted elements.

// Example 1:

// Input: nums = [1,2,3]

// Output: 6

// Explanation: The encrypted elements are [1,2,3]. The sum of encrypted elements is 1 + 2 + 3 == 6.

// Example 2:

// Input: nums = [10,21,31]

// Output: 66

// Explanation: The encrypted elements are [11,22,33]. The sum of encrypted elements is 11 + 22 + 33 == 66.

// Constraints:

// 1 <= nums.length <= 50
// 1 <= nums[i] <= 1000

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += encrypt(num);
        }
        return sum;
    }

    private int encrypt(int n) {
        int maxDigit = 0;
        int count = 0;

        int temp = n;
        while (temp > 0) {
            maxDigit = Math.max(maxDigit, temp % 10);
            temp /= 10;
            count++;
        }

        int res = 0;
        for (int i = 0; i < count; i++) {
            res = res * 10 + maxDigit;
        }
        return res;
    }
}

public class APR_18_leetCode {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 10, 21, 31 };

        System.out.println(solution.sumOfEncryptedInt(nums1)); // Output: 6
        System.out.println(solution.sumOfEncryptedInt(nums2)); // Output: 66
    }
}