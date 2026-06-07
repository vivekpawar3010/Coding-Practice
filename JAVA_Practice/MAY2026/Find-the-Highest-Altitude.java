1class Solution {
2    public int largestAltitude(int[] gain) {
3        int maxalt = 0;
4        int curr = 0;
5        for(int point : gain){
6            curr += point;
7            if(maxalt < curr) maxalt = curr;
8        }
9        return maxalt;
10    }
11}