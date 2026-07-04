public class MAY_30_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int columnNumber = 28;

        String result = sol.convertToTitle(columnNumber);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char ch = (char) ('A' + (columnNumber % 26));
            result.append(ch);
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}