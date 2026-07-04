public class MAY_12_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "a1b2c3";

        String result = sol.clearDigits(s);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public String clearDigits(String s) {
        StringBuilder out = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                out.append(c);
            } else if (out.length() > 0) {
                out.deleteCharAt(out.length() - 1);
            }
        }
        return out.toString();
    }
}