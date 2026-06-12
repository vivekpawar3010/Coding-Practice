1class Solution {
2    public int countHillValley(int[] nums) {
3        int ct = 0;
4        // Store the actual value of the last unique left neighbor
5        int leftVal = nums[0]; 
6        
7        for (int i = 1; i < nums.length - 1; ++i) {
8            if (nums[i] != nums[i + 1]) {
9                if ((nums[i] > leftVal && nums[i] > nums[i + 1]) || 
10                    (nums[i] < leftVal && nums[i] < nums[i + 1])) {
11                    ct++;
12                }
13                leftVal = nums[i]; 
14            }
15        }
16        return ct;
17    }
18}
19