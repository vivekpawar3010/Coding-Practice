// 771. Jewels and Stones
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

// Example 1:

// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3
// Example 2:

// Input: jewels = "z", stones = "ZZ"
// Output: 0

// Constraints:

// 1 <= jewels.length, stones.length <= 50
// jewels and stones consist of only English letters.
// All the characters of jewels are unique.

import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            int jem = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                if (jem == stones.charAt(j)) {
                    result++;
                }
            }
        }
        return result;
    }
}

public class FEB_12_Leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(sol.numJewelsInStones(jewels, stones)); // Output: 3
    }
}
