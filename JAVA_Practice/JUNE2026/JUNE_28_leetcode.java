import java.util.*;

public class JUNE_28_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int result = sol.diagonalSum(mat);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - i - 1];
        }
        if (n % 2 != 0) {
            sum -= (mat[n / 2][n / 2]);
        }
        return sum;
    }
}
