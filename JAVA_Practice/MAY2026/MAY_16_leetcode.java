public class MAY_16_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3, 4 };
        int k = 2;

        int result = sol.countPairs(nums, k);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int countPairs(int[] nums, int k) {
        int ct = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0)
                    ct++;
            }
        }
        return ct;
    }
}