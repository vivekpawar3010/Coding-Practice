import java.util.*;

public class JUNE_6_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 12, 345, 2, 6, 7896 };

        int result = sol.findNumbers(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((nums[i] >= 10 && nums[i] <= 99) || (nums[i] >= 1000 && nums[i] <= 9999) || nums[i] == 100000) {
                count++;
            }
        }
        return count;
    }
}
