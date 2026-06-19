1class Solution {
2    public int[] applyOperations(int[] nums) {
3        int n = nums.length;
4
5        for(int i = 0; i < n - 1; i++){
6            if(nums[i] == nums[i + 1]){
7                nums[i] = nums[i] * 2;
8                nums[i + 1] = 0;
9            }
10        }
11
12        //shift all 0 to end
13        int i = 0, j = 0;
14        while(j < n){
15            if(nums[j] != 0){
16                int temp = nums[j];
17                nums[j] = nums[i];
18                nums[i] = temp;
19                i++;
20            }
21            j++;
22        }
23
24        return nums;
25    }
26}