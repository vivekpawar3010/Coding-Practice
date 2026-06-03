1class Solution {
2    public boolean threeConsecutiveOdds(int[] arr) {
3        int n = arr.length;
4        if(n < 3) return false;
5
6        int cnsodd = 0;
7        for(int i = 0; i < n; i++){
8            if(arr[i] % 2 != 0) cnsodd++;
9            else cnsodd = 0;
10            if(cnsodd == 3) return true;
11        }
12        return false;
13    }
14}