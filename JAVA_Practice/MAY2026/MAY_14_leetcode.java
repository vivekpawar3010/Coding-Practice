public class MAY_14_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3 };

        int[] result = sol.getConcatenation(nums);
        System.out.println("Result: " + java.util.Arrays.toString(result));
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = nums[i % n];
        }

        return arr;
    }
}