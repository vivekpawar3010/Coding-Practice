public class MAY_29_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String columnTitle = "AB";

        int result = sol.titleToNumber(columnTitle);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int titleToNumber(String columnTitle) {
        int columnNum = 0;
        for (char c : columnTitle.toCharArray()) {
            columnNum = columnNum * 26 + (c - 'A' + 1);
        }
        return columnNum;
    }
}