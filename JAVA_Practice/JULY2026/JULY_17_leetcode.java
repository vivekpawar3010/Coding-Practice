// 1790. Check if One String Swap Can Make Strings Equal
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

// Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

// Example 1:

// Input: s1 = "bank", s2 = "kanb"
// Output: true
// Explanation: For example, swap the first character with the last character of s2 to make "bank".
// Example 2:

// Input: s1 = "attack", s2 = "defend"
// Output: false
// Explanation: It is impossible to make them equal with one string swap.
// Example 3:

// Input: s1 = "kelb", s2 = "kelb"
// Output: true
// Explanation: The two strings are already equal, so no string swap operation is required.

// Constraints:

// 1 <= s1.length, s2.length <= 100
// s1.length == s2.length
// s1 and s2 consist of only lowercase English letters.

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        if (s2.length() != n)
            return false;

        Map<Character, Integer> freq = new HashMap<>();
        int ct = 0;

        for (int i = 0; i < n; i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if (a != b) {
                freq.put(a, freq.getOrDefault(a, 0) + 1);
                freq.put(b, freq.getOrDefault(b, 0) - 1);
                ct++;
                if (ct > 2)
                    return false;
            }
        }

        if (ct == 0)
            return true;

        if (ct == 1)
            return false;

        for (int val : freq.values()) {
            if (val != 0)
                return false;
        }

        return true;
    }
}

public class JULY_17_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "bank";
        String s2 = "kanb";

        boolean result = sol.areAlmostEqual(s1, s2);
        System.out.println("Result: " + result);
    }
}
