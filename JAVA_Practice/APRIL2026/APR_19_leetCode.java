
// 1221. Split a String in Balanced Strings
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

// Given a balanced string s, split it into some number of substrings such that:

// Each substring is balanced.
// Return the maximum number of balanced strings you can obtain.

// Example 1:

// Input: s = "RLRRLLRLRL"
// Output: 4
// Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
// Example 2:

// Input: s = "RLRRRLLRLL"
// Output: 2
// Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
// Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
// Example 3:

// Input: s = "LLLLRRRR"
// Output: 1
// Explanation: s can be split into "LLLLRRRR".

// Constraints:

// 2 <= s.length <= 1000
// s[i] is either 'L' or 'R'.
// s is a balanced string.
public class APR_19_leetCode {

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(Solution.balancedStringSplit(s));
        // Output: 4

        s = "RLRRRLLRLL";
        System.out.println(Solution.balancedStringSplit(s));
        // Output: 2
    }
}

public static class Solution {
    public static int balancedStringSplit(String s) {
        int ctR = 0;
        int ctL = 0;
        int balaStr = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R')
                ctR++;
            else if (c == 'L')
                ctL++;
            if (ctR != 0 && ctR == ctL) {
                balaStr++;
                ctR = 0;
                ctL = 0;
            }
        }
        return balaStr;
    }
}