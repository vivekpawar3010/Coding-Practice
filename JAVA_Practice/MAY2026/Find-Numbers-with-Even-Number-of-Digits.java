1class Solution {
2    public int findNumbers(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        for(int i = 0; i < n; i++){
6            if ((nums[i] >= 10 && nums[i] <= 99) || (nums[i] >= 1000 && nums[i] <= 9999) || nums[i] == 100000) { 
7                count++; 
8            } 
9        }
10        return count;
11    }
12}