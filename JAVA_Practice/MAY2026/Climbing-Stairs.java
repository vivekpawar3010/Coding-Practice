1class Solution {
2    public int climbStairs(int n) {
3        if(n <= 3) return n;
4
5        int n1 = 3;
6        int n2 = 2;
7        int n3 = 0;
8
9        for(int i = 3; i < n; i++){
10            n3 = n1 + n2;
11            n2 = n1;
12            n1 = n3;
13        }
14        return n3;
15    }
16}