import java.util.*;

public class JUNE_3_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 2, 5, 6, 9, 10 };

        int result = sol.findGCD(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min)
                min = num;
            else if (num > max)
                max = num;
        }
        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
