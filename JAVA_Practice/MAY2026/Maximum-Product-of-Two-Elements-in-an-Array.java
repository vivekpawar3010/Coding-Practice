1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = 0;
4        for(int i = 0; i < nums.length; i++){
5            for(int j = i + 1; j < nums.length; j++){
6                if((nums[i] - 1) * (nums[j] - 1) > max) max = (nums[i] - 1) * (nums[j] - 1);
7            }
8        }
9        return max;
10    }
11}