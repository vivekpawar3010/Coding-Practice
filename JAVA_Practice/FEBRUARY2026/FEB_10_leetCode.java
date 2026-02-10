// public 3794. Reverse String Prefix
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given a string s and an integer k.

// Reverse the first k characters of s and return the resulting string.

// Example 1:

// Input: s = "abcd", k = 2

// Output: "bacd"

// Explanation:​​​​​​​

// The first k = 2 characters "ab" are reversed to "ba". The final resulting string is "bacd".

// Example 2:

// Input: s = "xyz", k = 3

// Output: "zyx"

// Explanation:

// The first k = 3 characters "xyz" are reversed to "zyx". The final resulting string is "zyx".

// Example 3:

// Input: s = "hey", k = 1

// Output: "hey"

// Explanation:

// The first k = 1 character "h" remains unchanged on reversal. The final resulting string is "hey".

// Constraints:

// 1 <= s.length <= 100
// s consists of lowercase English letters.
// 1 <= k <= s.length FEB_10_leetCode {

// }

import java.util.*;

class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sp = new StringBuilder();
        sp.append(s);
        for (int i = 1; i <= k; i++) {
            sp.setCharAt(i - 1, s.charAt(k - i));
        }
        return sp.toString();
    }
}
package JAVA_Practice.FEBRUARY2026;

public class FEB_10_leetCode {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcd";
        int k = 2;
        System.out.println(solution.reversePrefix(s, k));
    }
}