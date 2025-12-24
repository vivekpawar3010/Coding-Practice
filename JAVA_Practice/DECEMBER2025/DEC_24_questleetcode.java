// Q2. Smallest Integer Divisible by K
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given a positive integer k, you need to find the length of the smallest positive integer n such that n is divisible by k, and n only contains the digit 1.

// Return the length of n. If there is no such n, return -1.

// Note: n may not fit in a 64-bit signed integer.

 

// Example 1:

// Input: k = 1
// Output: 1
// Explanation: The smallest answer is n = 1, which has length 1.
// Example 2:

// Input: k = 2
// Output: -1
// Explanation: There is no such positive integer n divisible by 2.
// Example 3:

// Input: k = 3
// Output: 3
// Explanation: The smallest answer is n = 111, which has length 3.
 

// Constraints:

// 1 <= k <= 105
class Solution {
    public int smallestRepunitDivByK(int k) {
        // for the number k is divisible by 2 and 5 retur -1
        if(k % 2 == 0 || k % 5 == 0) return -1;
        
        // take the number rem
        int rem = 0;

        //for the most of the numbers the size of the number will up to k
        for(int i = 1; i <= k; i++) {
            rem = (rem * 10 + 1) % k;
            if(rem == 0) {
                return i;
            }
        }
        return -1;
    }
}
public class DEC_24_questleetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test Case 1
        int k1 = 1;
        System.out.println("Test 1 - Input: " + k1);
        System.out.println("Output: " + sol.smallestRepunitDivByK(k1));
        
        // Test Case 2
        int k2 = 2;
        System.out.println("Test 2 - Input: " + k2);
        System.out.println("Output: " + sol.smallestRepunitDivByK(k2));
        
        // Test Case 3
        int k3 = 3;
        System.out.println("Test 3 - Input: " + k3);
        System.out.println("Output: " + sol.smallestRepunitDivByK(k3));
        
        // Additional Test Case
        int k4 = 7;
        System.out.println("Test 4 - Input: " + k4);
        System.out.println("Output: " + sol.smallestRepunitDivByK(k4));
    }
}
