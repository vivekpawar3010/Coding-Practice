// 693. Binary Number with Alternating Bits
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

// Example 1:

// Input: n = 5
// Output: true
// Explanation: The binary representation of 5 is: 101
// Example 2:

// Input: n = 7
// Output: false
// Explanation: The binary representation of 7 is: 111.
// Example 3:

// Input: n = 11
// Output: false
// Explanation: The binary representation of 11 is: 1011.

// Constraints:

// 1 <= n <= 231 - 1

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean hasAlternatingBits(int n) {

        int prev = n & 1; // get last bit
        n = n >> 1;

        while (n > 0) {
            int curr = n & 1;

            if (curr == prev) {
                return false;
            }

            prev = curr;
            n = n >> 1;
        }

        return true;
    }
}

public class FEB_18_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.hasAlternatingBits(5)); // Output: true
        System.out.println(sol.hasAlternatingBits(7)); // Output: false
        System.out.println(sol.hasAlternatingBits(11)); // Output: false
    }

}