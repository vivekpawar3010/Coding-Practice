1class Solution {
2    public int subsetXORSum(int[] nums) {
3        int allXOR = 0;
4        for(int num : nums){
5            allXOR |= num;
6        }  
7        return allXOR * (1 << (nums.length - 1));
8    }
9}