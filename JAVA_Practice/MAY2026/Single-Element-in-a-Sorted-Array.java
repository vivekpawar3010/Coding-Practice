1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int i = 0;
4        int j = nums.length - 1;
5        while(i < j){
6            int mid = i + (j - i)/2;
7
8            if(mid % 2 == 1) mid--;
9
10            if(nums[mid] == nums[mid + 1]){
11                i = mid + 2;
12            }else{
13                j = mid;
14            }
15        }
16        return nums[i];
17    }
18}