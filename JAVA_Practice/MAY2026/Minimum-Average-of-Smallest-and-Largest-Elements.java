1import java.util.Arrays;
2
3class Solution {
4    public double minimumAverage(int[] nums) {
5        Arrays.sort(nums);
6
7        double minAvg = Double.MAX_VALUE;
8        int n = nums.length;
9
10        for (int i = 0; i < n / 2; i++) {
11            double avg = (nums[i] + nums[n - 1 - i]) / 2.0;
12            minAvg = Math.min(minAvg, avg);
13        }
14
15        return minAvg;
16    }
17}