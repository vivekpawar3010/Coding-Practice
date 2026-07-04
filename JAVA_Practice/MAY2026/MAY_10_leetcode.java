public class MAY_10_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aaa";
        String[] words = { "a", "aa", "aaa" };

        boolean result = sol.isPrefixString(s, words);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);

            if (sb.length() == s.length()) {
                return sb.toString().equals(s);
            }

            if (sb.length() > s.length()) {
                return false;
            }
        }

        return false;
    }
}