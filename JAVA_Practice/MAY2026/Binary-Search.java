1class Solution {
2    public int search(int[] nums, int target) {
3        int i = 0, j = nums.length - 1;
4        while(i <= j){
5            int mid = i + (j - i) / 2;
6            if(nums[mid] == target) return mid;
7            else if(nums[mid] > target) j = mid - 1;
8            else i = mid + 1;
9        }
10        return -1;
11    }
12}