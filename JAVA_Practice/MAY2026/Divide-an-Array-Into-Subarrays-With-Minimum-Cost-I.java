1class Solution {
2    public int minimumCost(int[] nums) {
3        int n = nums.length;
4        int minCost = Integer.MAX_VALUE;
5
6        for(int i = 0; i <= 0; i++){
7            for(int j = i + 1; j < n; j++){
8                for(int k = j + 1; k < n; k++){
9                    minCost = Math.min(minCost, nums[i] + nums[j] + nums[k]);
10                }
11            }
12        }
13
14        return minCost;
15    }
16}