import java.util.*;

public class JUNE_5_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid = { { 1, 2 }, { 2, 2 } };

        int[] result = sol.findMissingAndRepeatedValues(grid);
        System.out.println("Result: " + Arrays.toString(result));
    }
}

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        int[] freq = new int[N + 1];
        int rep = -1, mis = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }
        for (int i = 1; i <= N; i++) {
            if (freq[i] == 2)
                rep = i;
            if (freq[i] == 0)
                mis = i;
        }
        return new int[] { rep, mis };
    }
}
