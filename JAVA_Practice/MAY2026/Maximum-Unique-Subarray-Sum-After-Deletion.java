1class Solution {
2    public int maxSum(int[] nums) {
3        int n = nums.length;
4        Set<Integer> uq = new HashSet<>();
5
6        for(int num : nums){
7            uq.add(num);
8        }
9        int maxsum = 0;
10        for(int num : uq){
11            if(num > 0) maxsum += num;
12        }
13        if(maxsum == 0){
14            maxsum = Integer.MIN_VALUE;
15            for(int num : uq){
16                maxsum = (maxsum < num)? num: maxsum;
17            }
18        }
19        return maxsum;
20
21    }
22}