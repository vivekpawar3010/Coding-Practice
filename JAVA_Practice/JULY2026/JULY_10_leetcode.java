import java.util.*;

public class JULY_10_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 5;

        int result = sol.findComplement(num);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int findComplement(int num) {
        if (num == 0)
            return 1;

        int bitLength = 32 - Integer.numberOfLeadingZeros(num);

        int mask = (1 << bitLength) - 1;

        return num ^ mask;
    }
}