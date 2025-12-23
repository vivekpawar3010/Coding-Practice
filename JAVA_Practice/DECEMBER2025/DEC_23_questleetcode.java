// Q1. Ugly Number
// Attempted
// Easy
// Topics
// premium lock icon
// Companies
// An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

// Given an integer n, return true if n is an ugly number.

 

// Example 1:

// Input: n = 6
// Output: true
// Explanation: 6 = 2 × 3
// Example 2:

// Input: n = 1
// Output: true
// Explanation: 1 has no prime factors.
// Example 3:

// Input: n = 14
// Output: false
// Explanation: 14 is not ugly since it includes the prime factor 7.
 

// Constraints:

// -231 <= n <= 231 - 1
 


class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        int[] factors = {2, 3, 5};

        for (int f : factors) {
            while (n % f == 0) {
                n /= f;
            }
        }

        return n == 1;
    }
}

public class DEC_23_questleetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test Case 1
        int n1 = 6;
        System.out.println("Test 1 - Input: " + n1);
        System.out.println("Output: " + sol.isUgly(n1));
        
        // Test Case 2
        int n2 = 1;
        System.out.println("\nTest 2 - Input: " + n2);
        System.out.println("Output: " + sol.isUgly(n2));
        
        // Test Case 3
        int n3 = 14;
        System.out.println("\nTest 3 - Input: " + n3);
        System.out.println("Output: " + sol.isUgly(n3));
    }
}
