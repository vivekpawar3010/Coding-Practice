1class Solution {
2    public long coloredCells(int n) {
3        return 1 + 4l * n * (n - 1) / 2;
4    }
5}