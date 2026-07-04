public class MAY_9_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 2, 3, 3, 2 };

        boolean result = sol.isGood(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public boolean isGood(int[] nums) {
        int len = nums.length;
        int n = len - 1;

        if (len < 2) {
            return false;
        }

        int[] arr = new int[n + 1];

        for (int num : nums) {
            if (num < 1 || num > n) {
                return false;
            }
            arr[num]++;
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }

        return arr[n] == 2;
    }
}