public class MAY_2_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;

        int result = sol.search(nums, target);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return -1;
    }
}