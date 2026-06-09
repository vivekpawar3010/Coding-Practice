1class Solution {
2    public int maxAscendingSum(int[] nums) {
3        int maxSum = nums[0];
4        int currentSum = nums[0];
5        
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] > nums[i - 1]) {
8                currentSum += nums[i];
9            } else {
10                currentSum = nums[i];
11            }
12            maxSum = Math.max(maxSum, currentSum);
13        }
14        
15        return maxSum;
16    }
17}