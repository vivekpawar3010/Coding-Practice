1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0, mid = 0, high = nums.length - 1;
4        
5        while (mid <= high) {
6            if (nums[mid] == 0) {
7                swap(nums, mid, low);
8                low++;
9                mid++;
10            } else if (nums[mid] == 1) {
11                mid++;
12            } else if (nums[mid] == 2) {
13                swap(nums, mid, high);
14                high--;
15            }
16        }
17    }
18    
19    private void swap(int[] nums, int i, int j) {
20        int temp = nums[i];
21        nums[i] = nums[j];
22        nums[j] = temp;
23    }
24}
25