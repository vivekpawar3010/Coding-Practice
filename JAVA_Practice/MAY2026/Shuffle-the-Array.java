1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] shuffled = new int[n * 2];
4        for(int i = 0; i < n; i++){
5            shuffled[i * 2] = nums[i];
6            shuffled[(i*2) + 1] = nums[i + n];
7        }
8        return shuffled;
9    }
10}