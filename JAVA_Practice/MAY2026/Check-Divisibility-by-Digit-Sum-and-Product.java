1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum = 0, product = 1, k = n;
4        while (k > 0) {
5            int temp = k % 10;
6            sum += temp;
7            product *= temp;
8            k /= 10;
9        }
10        return n % (sum + product) == 0;
11    }
12}