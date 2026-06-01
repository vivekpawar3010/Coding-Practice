1class Solution {
2    public int minElement(int[] nums) {
3        int min = Integer.MAX_VALUE;
4        for(int i = 0; i < nums.length; i++){
5            int sum = 0;
6            while(nums[i] > 0){
7                sum += nums[i] % 10;
8                nums[i] /= 10;
9            }
10            if(sum < min){
11                min = sum;
12                if(min == 1) return 1;
13            }
14        }
15        return min;
16    }
17}