// 1861. Rotating the Box
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// You are given an m x n matrix of characters boxGrid representing a side-view of a box. Each cell of the box is one of the following:

// A stone '#'
// A stationary obstacle '*'
// Empty '.'
// The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.

// It is guaranteed that each stone in boxGrid rests on an obstacle, another stone, or the bottom of the box.

// Return an n x m matrix representing the box after the rotation described above.

// Example 1:

// Input: boxGrid = [["#",".","#"]]
// Output: [["."],
//          ["#"],
//          ["#"]]
// Example 2:

// Input: boxGrid = [["#",".","*","."],
//               ["#","#","*","."]]
// Output: [["#","."],
//          ["#","#"],
//          ["*","*"],
//          [".","."]]
// Example 3:

// Input: boxGrid = [["#","#","*",".","*","."],
//               ["#","#","#","*",".","."],
//               ["#","#","#",".","#","."]]
// Output: [[".","#","#"],
//          [".","#","#"],
//          ["#","#","*"],
//          ["#","*","."],
//          ["#",".","*"],
//          ["#",".","."]]

// Constraints:

// m == boxGrid.length
// n == boxGrid[i].length
// 1 <= m, n <= 500
// boxGrid[i][j] is either '#', '*', or '.'.

public class APR_24_leetCode {
    public static void main(String[] args) {
        char[][] boxGrid = { { '#', '.', '#' } };
        char[][] result = Solution.rotateTheBox(boxGrid);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public static char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        char[][] updated = new char[m][n];

        for (int i = 0; i < m; i++) {
            int dot = 0;
            int hash = 0;
            for (int j = 0; j < n; j++) {
                if (boxGrid[i][j] == '.')
                    dot++;
                else if (boxGrid[i][j] == '#')
                    hash++;
                else {
                    updated[i][j] = boxGrid[i][j];
                    int k = j - 1;
                    while (hash > 0) {
                        updated[i][k--] = '#';
                        hash--;
                    }
                    while (dot > 0) {
                        updated[i][k--] = '.';
                        dot--;
                    }
                }
            }
            int k = n - 1;
            while (hash > 0) {
                updated[i][k--] = '#';
                hash--;
            }
            while (dot > 0) {
                updated[i][k--] = '.';
                dot--;
            }
        }

        char[][] rotated = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][m - 1 - i] = updated[i][j];
            }
        }
        return rotated;
    }
}