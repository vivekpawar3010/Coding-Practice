1class Solution {
2    public int findGCD(int[] nums) {
3        int min = nums[0];
4        int max = nums[0];
5        for(int num : nums){
6            if(num < min) min = num;
7            else if(num > max) max = num;
8        }
9
10        return gcd(min, max);
11    }
12
13    private int gcd(int a, int b) {
14        while (b != 0) {
15            int temp = b;
16            b = a % b;
17            a = temp;
18        }
19        return a;
20    }
21}