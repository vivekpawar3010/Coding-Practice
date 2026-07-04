public class MAY_3_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3, 4 };

        int result = sol.evenNumberBitwiseORs(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                ans |= num;
        }
        return ans;
    }
}