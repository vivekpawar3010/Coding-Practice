public class MAY_6_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 12;

        boolean result = sol.checkDivisibility(n);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, product = 1, k = n;
        while (k > 0) {
            int temp = k % 10;
            sum += temp;
            product *= temp;
            k /= 10;
        }
        return n % (sum + product) == 0;
    }
}