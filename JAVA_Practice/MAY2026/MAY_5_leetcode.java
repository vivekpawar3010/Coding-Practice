public class MAY_5_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String num = "1234";

        boolean result = sol.isBalanced(num);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public boolean isBalanced(String num) {
        int oddsum = 0;
        int evensum = 0;
        int count = 0;
        for (char n : num.toCharArray()) {
            int a = (n - '0');
            if (count % 2 == 0)
                evensum += a;
            else
                oddsum += a;
            count++;
        }
        return oddsum == evensum;
    }
}