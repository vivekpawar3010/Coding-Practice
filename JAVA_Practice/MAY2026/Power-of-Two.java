1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n <= 0) return false;
4        while(n > 1){
5            if(n % 2 != 0) return false;
6            n /= 2;
7        }
8        return true;
9    }
10}