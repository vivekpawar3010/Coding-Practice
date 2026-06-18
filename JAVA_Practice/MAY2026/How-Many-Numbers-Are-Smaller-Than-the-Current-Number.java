1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int n = nums.length;
4
5        int[] arr = new int[n];
6
7        for(int i = 0; i < n; i++){
8            int ct = 0;
9            for(int num : nums)
10            {
11                if(nums[i] > num) ct++;
12            }
13            arr[i] = ct;
14        }
15
16        return arr;
17    }
18}