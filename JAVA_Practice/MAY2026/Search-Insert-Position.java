1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int i = 0;
4        int j = nums.length - 1; 
5        while(i <= j){
6            int mid = i + (j - i)/ 2;
7            if(nums[mid] == target){
8                return mid;
9            }else if(nums[mid] > target){
10                j = mid - 1;
11            }else {
12                i = mid + 1;
13            }
14
15        }
16        return i;
17        
18    }
19}