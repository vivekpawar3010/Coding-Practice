1class Solution {
2    public int maximumDifference(int[] nums) {
3        int n = nums.length;
4        int max = -1;
5        for(int i = 0; i < n; i++){
6            for(int j = i + 1; j < n; j++){
7                if(nums[j] - nums[i] > max) max = nums[j] - nums[i];
8            }
9        }
10        return max!=0? max : -1;
11    }
12}