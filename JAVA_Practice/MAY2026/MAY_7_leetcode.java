public class MAY_7_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String sentence = "i love eating burger";
        String searchWord = "burg";

        int result = sol.isPrefixOfWord(sentence, searchWord);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String currword = words[i];

            if (currword.startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }
}