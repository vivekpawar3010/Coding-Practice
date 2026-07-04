import java.util.*;

public class JUNE_12_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "1210";

        String result = sol.findValidPair(s);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public String findValidPair(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            if (first != second) {
                int firstValue = first - '0';
                int secondValue = second - '0';
                if (freq.get(first) == firstValue && freq.get(second) == secondValue) {
                    return "" + first + second;
                }
            }
        }
        return "";
    }
}
