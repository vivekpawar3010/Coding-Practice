1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int[] result = new int[nums.length];
4
5        int total = 0, left = 0;
6        for(int num : nums){
7            total += num;
8        }
9
10        for(int i = 0; i < nums.length; i++){
11            result[i] = Math.abs(left - (total - left - nums[i]));
12            left += nums[i];
13        }
14        return result;
15    }
16}