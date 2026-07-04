import java.util.*;

public class JUNE_18_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 8, 1, 2, 2, 3 };

        int[] result = sol.smallerNumbersThanCurrent(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }
}

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int ct = 0;
            for (int num : nums) {
                if (nums[i] > num)
                    ct++;
            }
            arr[i] = ct;
        }
        return arr;
    }
}
