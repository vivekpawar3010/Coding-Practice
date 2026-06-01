1class Solution {
2    public int smallestNumber(int n) {
3        int result = 1, update = 1;
4        while(result < n){
5            update *= 2;
6            result += update;
7        }
8        return result;
9
10
11    }
12   
13
14}