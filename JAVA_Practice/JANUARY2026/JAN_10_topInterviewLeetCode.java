// 58. Length of Last Word
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

 

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.
 

// Constraints:

// 1 <= s.length <= 104
// s consists of only English letters and spaces ' '.
// There will be at least one word in s.

import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        int llw = 0; 
        int wordstart = s.length() - 1;

        // Skip trailing spaces
        while (wordstart >= 0 && s.charAt(wordstart) == ' ') {
            wordstart--;
        }

        int temp = wordstart;

        // Count last word characters
        while (wordstart >= 0 && s.charAt(wordstart) != ' ') {
            wordstart--;
        }

        return temp - wordstart;
    }
}

public class JAN_10_topInterviewLeetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "   fly me   to   the moon  ";
        System.out.println(sol.lengthOfLastWord(s)); // Output: 4
    }
}
