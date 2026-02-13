// 3541. Find Most Frequent Vowel and Consonant
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given a string s consisting of lowercase English letters ('a' to 'z').

// Your task is to:

// Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
// Find the consonant (all other letters excluding vowels) with the maximum frequency.
// Return the sum of the two frequencies.

// Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.

// The frequency of a letter x is the number of times it occurs in the string.

// Example 1:

// Input: s = "successes"

// Output: 6

// Explanation:

// The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
// The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
// The output is 2 + 4 = 6.
// Example 2:

// Input: s = "aeiaeia"

// Output: 3

// Explanation:

// The vowels are: 'a' (frequency 3), 'e' ( frequency 2), 'i' (frequency 2). The maximum frequency is 3.
// There are no consonants in s. Hence, maximum consonant frequency = 0.
// The output is 3 + 0 = 3.

// Constraints:

// 1 <= s.length <= 100
// s consists of lowercase English letters only.

import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        int[] atoz = new int[26];
        char[] sArr = s.toCharArray();

        // Count frequencies of each character
        for (char ch : sArr) {
            atoz[ch - 97]++;
        }

        int conmax = 0, vomax = 0;

        for (int i = 0; i < 26; i++) {
            // Check if the index corresponds to a, e, i, o, or u
            boolean isVowel = (i == 0 || i == 4 || i == 8 || i == 14 || i == 20);

            if (isVowel) {
                vomax = Math.max(atoz[i], vomax);
            } else {
                conmax = Math.max(atoz[i], conmax);
            }
        }

        return conmax + vomax;
    }
}

public class FEB_13_leetCode {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "successes";
        System.out.println(sol.maxFreqSum(s)); // Output: 6
    }

}
