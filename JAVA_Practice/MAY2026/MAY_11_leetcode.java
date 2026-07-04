public class MAY_11_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };

        boolean result = sol.arrayStringsAreEqual(word1, word2);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}