1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int ct0 = 0;
5        int idx0 = -1;
6        for(int i = 0; i < n; i++){
7            if(nums[i] == 0){
8                ct0++;
9                idx0 = i;
10                if(ct0 > 1) return new int[n];
11            }
12        }
13        int allproduct = 1;
14        int ans[] = new int[n];
15        if(ct0 == 1){
16            for(int i = 0; i < n; i++){
17                if(i == idx0) continue;
18                allproduct *= nums[i];
19            }
20            ans[idx0] = allproduct;
21            return ans;
22        }
23
24        for(int num : nums){
25            allproduct *= num;
26        }
27        for(int i = 0; i < n ; i++){
28            ans[i] = allproduct / nums[i];
29        }
30        return ans;
31    }
32}