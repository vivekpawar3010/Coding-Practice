import java.util.*;

public class JUNE_15_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;

        int result = sol.gcdOfOddEvenSums(n);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = n * (n + 1);
        int b = n * n;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
