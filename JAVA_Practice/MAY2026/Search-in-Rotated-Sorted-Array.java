1class Solution {
2    public int search(int[] nums, int target) {
3        int i = 0, j = nums.length - 1;
4
5        while(i <= j){
6            int mid = i + (j - i) / 2;
7
8            if(nums[mid] == target) return mid;
9
10            if(nums[i] <= nums[mid]) {
11                if(nums[i] <= target && target < nums[mid]) {
12                    j = mid - 1;
13                }else{
14                    i = mid + 1;
15                }
16            } else{
17                if(nums[mid] < target && target <= nums[j]){
18                    i = mid + 1;
19                }else{
20                    j = mid - 1;
21                }
22            }
23        }
24        return -1;
25    }
26}