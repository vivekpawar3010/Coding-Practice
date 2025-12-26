// Q1. Reverse Integer
// Medium
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
 

// Constraints:

// -231 <= x <= 231 - 1


class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Overflow check
            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 ||
               (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit;
        }

        return result;
    }
}

public class DEC_26_questleetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test Case 1
        int x1 = 123;
        System.out.println("Test 1 - Input: x = " + x1);
        System.out.println("Output: " + sol.reverse(x1)); // Expected Output: 321

        // Test Case 2
        int x2 = -123;
        System.out.println("Test 2 - Input: x = " + x2);
        System.out.println("Output: " + sol.reverse(x2)); // Expected Output: -321

        // Test Case 3
        int x3 = 120;
        System.out.println("Test 3 - Input: x = " + x3);
        System.out.println("Output: " + sol.reverse(x3)); // Expected Output: 21

        // Test Case 4 (Overflow)
        int x4 = 1534236469;
        System.out.println("Test 4 - Input: x = " + x4);
        System.out.println("Output: " + sol.reverse(x4)); // Expected Output: 0
    }
}
