public class MAY_15_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int result = sol.maxArea(height);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int maxArea(int[] height) {
        int waterArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            waterArea = Math.max(waterArea, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return waterArea;
    }
}