public class MAY_4_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;

        int result = sol.totalMoney(n);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;

        int money = 0;
        for (int i = 0; i < weeks; i++) {
            money += 28 + (i * 7);
        }

        for (int i = 1; i <= days; i++) {
            money += weeks + i;
        }
        return money;
    }
}