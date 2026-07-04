import java.util.*;

public class JUNE_19_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 1994;

        String result = sol.intToRoman(num);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
}
