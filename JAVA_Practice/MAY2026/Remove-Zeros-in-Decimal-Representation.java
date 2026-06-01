1class Solution {
2    public long removeZeros(long n) {
3        long ans = 0;
4        long pow = 1;
5        while(n > 0){
6            if(n % 10 != 0) {
7                ans = (n % 10) * pow + (ans);
8                pow *= 10;
9            }
10            n /= 10;
11        }
12        return ans;
13    }
14}