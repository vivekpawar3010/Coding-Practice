1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        int n = image.length;
4
5        for (int i = 0; i < n; i++) {
6            for (int j = 0; j < (n + 1) / 2; j++) {
7                int temp = image[i][j];
8                
9                image[i][j] = image[i][n - j - 1] ^ 1;
10                image[i][n - j - 1] = temp ^ 1;
11            }
12        }
13
14        return image;
15    }
16}
17