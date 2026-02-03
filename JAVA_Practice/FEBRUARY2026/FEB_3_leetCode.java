// 2942. Find Words Containing Character
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given a 0-indexed array of strings words and a character x.

// Return an array of indices representing the words that contain the character x.

// Note that the returned array may be in any order.

 

// Example 1:

// Input: words = ["leet","code"], x = "e"
// Output: [0,1]
// Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
// Example 2:

// Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
// Output: [0,2]
// Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
// Example 3:

// Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
// Output: []
// Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
 

// Constraints:

// 1 <= words.length <= 50
// 1 <= words[i].length <= 50
// x is a lowercase English letter.
// words[i] consists only of lowercase English letters.

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                if(words[i].charAt(j) == x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}

public class FEB_3_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words1 = {"leet","code"};
        char x1 = 'e';
        System.out.println(sol.findWordsContaining(words1, x1)); // Output: [0, 1]

        String[] words2 = {"abc","bcd","aaaa","cbc"};
        char x2 = 'a';
        System.out.println(sol.findWordsContaining(words2, x2)); // Output: [0, 2]

        String[] words3 = {"abc","bcd","aaaa","cbc"};
        char x3 = 'z';
        System.out.println(sol.findWordsContaining(words3, x3)); // Output: []
    }
}
