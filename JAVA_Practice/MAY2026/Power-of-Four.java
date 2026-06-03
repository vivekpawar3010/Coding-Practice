1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if(n <= 0) return false;
4        while(n > 1){
5            if(n % 4 != 0) return false;
6            n /= 4;
7        }
8        return true;
9    }
10}
11