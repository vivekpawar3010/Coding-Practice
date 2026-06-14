1class Solution {
2    public int maxAdjacentDistance(int[] nums) {
3        int n = nums.length;
4        int max = 0;
5        for(int i = 0; i < n; i++){
6            int diff = abs(nums[i] - nums[(i + 1) % n]);
7            max= (max < diff)? diff: max;
8        }
9        return max;
10    }
11
12    private int abs(int n){
13        return (n > 0)? n:-n;
14    }
15}