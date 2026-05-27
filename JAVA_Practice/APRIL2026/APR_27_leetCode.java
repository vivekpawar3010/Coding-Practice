// 3931. Check Adjacent Digit Differences
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given a string s consisting of digits.

// Return true if the absolute difference between every pair of adjacent digits is at most 2, otherwise return false.

// The absolute difference between a and b is defined as abs(a - b).

// Example 1:

// Input: s = "132"

// Output: true

// Explanation:

// The absolute difference between digits at s[0] and s[1] is abs(1 - 3) = 2.
// The absolute difference between digits at s[1] and s[2] is abs(3 - 2) = 1.
// Since both differences are at most 2, the answer is true.
// Example 2:

// Input: s = "129"

// Output: false

// Explanation:

// The absolute difference between digits at s[0] and s[1] is abs(1 - 2) = 1.
// The absolute difference between digits at s[1] and s[2] is abs(2 - 9) = 7, which is greater than 2.
// Therefore, the answer is false.

class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            int a = s.charAt(i);
            int b = s.charAt(i + 1);
            if (abs(a - b) > 2)
                return false;
        }
        return true;
    }

    public static int abs(int a) {
        return (a >= 0) ? a : -a;
    }
}

public class APR_27_leetCode {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.isAdjacentDiffAtMostTwo("132")); // expected true
        System.out.println(s.isAdjacentDiffAtMostTwo("129")); // expected false
    }
}
