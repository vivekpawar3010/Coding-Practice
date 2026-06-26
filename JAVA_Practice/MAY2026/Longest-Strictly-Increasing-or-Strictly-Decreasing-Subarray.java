1class Solution {
2    public int longestMonotonicSubarray(int[] nums) {
3        int n = nums.length;
4        int maxlen = 1;
5        int incr = 1;
6        int desc = 1;
7        for(int i = 1; i < n; i++){
8            if(nums[i] > nums[i - 1]){
9                incr++;
10                desc = 1;
11            }else if(nums[i] < nums[i - 1]){
12                desc++;
13                incr = 1;
14            }else{
15                incr = desc = 1;
16            }
17
18            maxlen = maxOfThree(maxlen, incr, desc);
19        }
20        return maxlen;
21    }
22
23    private int maxOfThree(int a, int b, int c){
24        return (a > b? (a>c? a : c) : (b > c? b : c));
25    }
26}