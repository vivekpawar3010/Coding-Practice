1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int n = mat.length;
4        int sum = 0;
5        for(int i = 0; i < n; i++){
6            sum += mat[i][i] + mat[i][n - i - 1];
7        }
8        if(n % 2 != 0){
9            sum -= (mat[n/2][n/2]);
10        }
11        return sum;
12    }
13}