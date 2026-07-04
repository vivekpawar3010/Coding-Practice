import java.util.*;

public class JUNE_20_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };

        int result = sol.islandPerimeter(grid);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int islandPerimeter(int[][] grid) {
        int out = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    out += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        out -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        out -= 2;
                    }
                }
            }
        }
        return out;
    }
}
