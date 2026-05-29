1class Solution {
2    public boolean canJump(int[] nums) {
3        int idx = 0;
4        for(int i = 0; i < nums.length; i++){
5            if(idx < i) return false;
6            idx = max(idx, i + nums[i]);
7        }
8
9        return true;
10    }
11
12    private int max(int a, int b){
13        return a>b ? a :b;
14    }
15}