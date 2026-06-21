1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int out = 0;
4        for (int i = 0; i < grid.length; i++) {
5            for (int j = 0; j < grid[0].length; ++j) {
6
7                if (grid[i][j] == 1) {
8                    out += 4;
9                    if(i > 0 && grid[i - 1][j] == 1){
10                        out -= 2;
11                    }
12                    if(j > 0 && grid[i][j - 1] == 1){
13                        out -=2;
14                    }
15                }
16            }
17        }
18        return out;
19    }
20}