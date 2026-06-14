1class Solution {
2    public String triangleType(int[] nums) {
3        int a = (nums[0] > nums[1] ? (nums[2] > nums[1] ? (nums[1]) : (nums[2])) : (nums[0] < nums[2]) ? (nums[0]) : (nums[2]));
4        int c = (nums[0] < nums[1] ? (nums[2] < nums[1] ? (nums[1]) : (nums[2])) : (nums[0] > nums[2]) ? (nums[0]) : (nums[2]));
5        int b = (nums[0] + nums[1] + nums[2]) - (a + c);
6        
7        if(a + b <= c) return "none";
8        if(a == b && b == c) return "equilateral";
9        else if(a == b || b == c || c == a) return "isosceles";
10        return "scalene";
11
12    }
13}