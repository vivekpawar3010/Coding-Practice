1import java.util.Arrays;

public class JULY_6_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {7, 4, 2, 10, 8};

        double result = sol.minimumAverage(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        double minAvg = Double.MAX_VALUE;
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            double avg = (nums[i] + nums[n - 1 - i]) / 2.0;
            minAvg = Math.min(minAvg, avg);
        }

        return minAvg;
    }
}