1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int n = nums.length;
4        int sumsqsp = 0;
5        for(int i = 0; i < n; i++){
6            if(n % (i + 1) == 0){
7                sumsqsp += (nums[i] * nums[i]);
8            }
9        }
10        return sumsqsp;
11    }
12}