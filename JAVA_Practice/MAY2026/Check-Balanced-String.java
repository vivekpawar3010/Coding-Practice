1class Solution {
2    public boolean isBalanced(String num) {
3        int oddsum = 0; 
4        int evensum = 0;
5        int count = 0;
6        for(char n : num.toCharArray()){
7            int a = (n - '0') ;
8            if( count % 2 == 0) evensum += a;
9            else oddsum += a;
10            count++;
11        }
12        return oddsum == evensum;
13    }
14}