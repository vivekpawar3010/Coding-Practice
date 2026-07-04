public class MAY_21_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;

        long result = sol.coloredCells(n);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public long coloredCells(int n) {
        return 1 + 4L * n * (n - 1) / 2;
    }
}