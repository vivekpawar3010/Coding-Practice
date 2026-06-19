1class Solution {
2    public int countSubarrays(int[] nums) {
3        int ct = 0;
4        for(int i = 0; i < nums.length - 2; i++){
5            if(nums[i] + nums[i + 2] == nums[i + 1] / 2.0) {
6                ct++;
7            }
8        }
9        return ct;
10    }
11}