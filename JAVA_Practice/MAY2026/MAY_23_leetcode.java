public class MAY_23_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "10#11#12";

        String result = sol.freqAlphabets(s);
        System.out.println("Result: " + result);
    }
}

class Solution {

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n) {
            if (i + 2 < n && s.charAt(i + 2) == '#') {
                int val = Integer.parseInt(s.substring(i, i + 2));
                sb.append((char) ('a' + val - 1));
                i += 3;
            } else {
                int val = s.charAt(i) - '0';
                sb.append((char) ('a' + val - 1));
                i++;
            }
        }

        return sb.toString();
    }
}