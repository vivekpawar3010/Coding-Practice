public class MAY_8_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abacbc";

        boolean result = sol.areOccurrencesEqual(s);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        char[] chArr = s.toCharArray();

        java.util.Map<Character, Integer> freq = new java.util.HashMap<>();

        for (char c : chArr) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int targetFreq = freq.get(chArr[0]);
        for (int ct : freq.values()) {
            if (targetFreq != ct)
                return false;
        }
        return true;
    }
}