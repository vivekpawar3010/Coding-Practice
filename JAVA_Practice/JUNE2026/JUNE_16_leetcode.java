import java.util.*;

public class JUNE_16_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ABCABC";
        String str2 = "ABC";

        String result = sol.gcdOfStrings(str1, str2);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
