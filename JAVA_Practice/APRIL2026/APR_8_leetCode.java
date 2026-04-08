// 2520. Count the Digits That Divide a Number
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer num, return the number of digits in num that divide num.

// An integer val divides nums if nums % val == 0.

// Example 1:

// Input: num = 7
// Output: 1
// Explanation: 7 divides itself, hence the answer is 1.
// Example 2:

// Input: num = 121
// Output: 2
// Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
// Example 3:

// Input: num = 1248
// Output: 4
// Explanation: 1248 is divisible by all of its digits, hence the answer is 4.

// Constraints:

// 1 <= num <= 109

class Solution {
    public int countDigits(int num) {
        return countdiv(num, num);
    }

    public int countdiv(int n, int dig) {
        if (dig < 10)
            return (n % (dig % 10) == 0 ? 1 : 0);
        return (n % (dig % 10) == 0 ? 1 : 0) + countdiv(n, dig / 10);
    }
}

public class APR_8_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 7;
        System.out.println(sol.countDigits(num));
        // output: 1
        num = 121;
        System.out.println(sol.countDigits(num));
        // output: 2
        num = 1248;
        System.out.println(sol.countDigits(num));
        // output: 4
    }
}
