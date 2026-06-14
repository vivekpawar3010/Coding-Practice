1class Solution {
2    public boolean canAliceWin(int n) {
3        int str = 10;
4
5        while(str >= 0){
6            if(n < str){
7                return (str & 1) != 0;
8            }
9            n -= str;
10            str--;
11        }
12        return false;
13    }
14}