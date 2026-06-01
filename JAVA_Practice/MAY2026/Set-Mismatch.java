1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        int[] check = new int[n];
5        for(int num : nums){
6            check[num - 1]++;
7        }
8        int[] ans = new int[2];
9        for(int i = 0; i < n; i++){
10            if(check[i] == 2)  ans[0] = i+ 1;
11            if(check[i] == 0)  ans[1] = i+ 1;
12        }
13        return ans;
14    }
15}