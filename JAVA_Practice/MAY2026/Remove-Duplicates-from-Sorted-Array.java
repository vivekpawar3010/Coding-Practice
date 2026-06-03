1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length == 0) return 0;
4
5        int j = 1; //Pointer for the position of unique elements
6
7        for(int i = 1; i < nums.length; i++){
8            if(nums[i] != nums[j - 1]) {
9                nums[j] = nums[i];
10                j++;
11            }
12        }
13
14        return j;
15    }
16}