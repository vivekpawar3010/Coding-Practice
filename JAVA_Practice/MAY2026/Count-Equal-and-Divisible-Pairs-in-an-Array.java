1class Solution {
2    public int countPairs(int[] nums, int k) {
3        int ct = 0;
4        int n = nums.length;
5        for(int i = 0; i < n; i++){
6            for(int j = i + 1; j < n; j++){
7                if(nums[i] == nums[j] && (i * j) % k == 0) ct++;
8            }
9        }
10        return ct;
11    }
12}