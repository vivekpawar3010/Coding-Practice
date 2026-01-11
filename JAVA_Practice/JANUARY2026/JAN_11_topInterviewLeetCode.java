// 392. Is Subsequence
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false
 

// Constraints:

// 0 <= s.length <= 100
// 0 <= t.length <= 104
// s and t consist only of lowercase English letters.

import java.util.*;
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty() || (s.isEmpty() && t.isEmpty())) return true;
        if (!s.isEmpty() && t.isEmpty()) return false;

        int sidx = 0;
        boolean check = false;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sidx) == t.charAt(i)) {
                sidx++;
                if (sidx >= s.length()) {
                    check = true;
                    break;
                }
            }
        }

        return check;
    }
}
public class JAN_11_topInterviewLeetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = sol.isSubsequence(s, t);
        System.out.println(result); // Expected output: true
    }
}