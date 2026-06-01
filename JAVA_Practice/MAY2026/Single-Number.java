1class Solution {
2    public int singleNumber(int[] nums) {
3        int unique = 0;
4        for(int i = 0 ; i < nums.length; i++){
5            unique = unique ^ nums[i];
6        }
7        return unique;
8    }
9}