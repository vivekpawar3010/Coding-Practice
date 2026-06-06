1class Solution {
2    public int evenNumberBitwiseORs(int[] nums) {
3        int ans = 0;
4        for(int num : nums){
5            if(num % 2 == 0) ans |= num;
6        } 
7        return ans;
8    }
9}