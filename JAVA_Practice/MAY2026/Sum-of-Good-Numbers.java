1class Solution {
2    public int sumOfGoodNumbers(int[] nums, int k) {
3        int sum = 0;
4        int n = nums.length;
5        for(int i = 0; i < n; i++){
6            boolean isGood = true;
7
8            if((i - k >= 0 && nums[i] <= nums[i - k]) || (i + k < n && nums[i] <= nums[i + k])) isGood = false;
9            if(isGood) sum += nums[i];
10        }
11        return sum;
12    }
13}