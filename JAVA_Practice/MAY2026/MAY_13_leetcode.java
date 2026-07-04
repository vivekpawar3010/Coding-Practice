public class MAY_13_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;

        int result = sol.climbStairs(n);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n <= 3)
            return n;

        int n1 = 3;
        int n2 = 2;
        int n3 = 0;

        for (int i = 3; i < n; i++) {
            n3 = n1 + n2;
            n2 = n1;
            n1 = n3;
        }
        return n3;
    }
}