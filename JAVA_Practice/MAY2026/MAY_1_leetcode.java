import java.util.Arrays;

public class MAY_1_leetcode {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] example1 = { 1, 2, 2, 1, 1, 0 };
        int[] example2 = { 0, 1, 2, 2, 3, 0 };
        int[] example3 = { 1, 1, 1, 1 };

        System.out.println("Example 1: " + Arrays.toString(sol.applyOperations(example1)));
        System.out.println("Example 2: " + Arrays.toString(sol.applyOperations(example2)));
        System.out.println("Example 3: " + Arrays.toString(sol.applyOperations(example3)));
    }
}

class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        int i = 0, j = 0;
        while (j < n) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            j++;
        }

        return nums;
    }
}
