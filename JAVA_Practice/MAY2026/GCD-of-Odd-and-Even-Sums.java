1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int a = n * (n + 1); 
4        int b = n * n;
5        
6        while (b != 0) {
7            int temp = b;
8            b = a % b;
9            a = temp;
10        }
11        return Math.abs(a); 
12    }
13}
14