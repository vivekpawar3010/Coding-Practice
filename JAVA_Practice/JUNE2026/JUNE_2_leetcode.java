import java.util.*;

public class JUNE_2_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = { "abc", "car", "ada" };

        String result = sol.firstPalindrome(words);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                return word;
            }
        }
        return "";
    }
}
