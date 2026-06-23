1class Solution {
2    public boolean isGood(int[] nums) {
3        int len = nums.length;
4        int n = len - 1;
5        
6        if (len < 2) {
7            return false;
8        }
9
10        int[] arr = new int[n + 1];
11        
12        for (int num : nums) {
13            if (num < 1 || num > n) {
14                return false;
15            }
16            arr[num]++;
17        }
18        
19        for (int i = 1; i < n; i++) {
20            if (arr[i] != 1) {
21                return false;
22            }
23        }
24        
25        return arr[n] == 2;
26    }
27}
28