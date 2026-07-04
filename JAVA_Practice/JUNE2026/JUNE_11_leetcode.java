import java.util.*;

public class JUNE_11_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 1000;

        int result = sol.getLeastFrequentDigit(n);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int getLeastFrequentDigit(int n) {
        if (n == 0)
            return 0;
        int[] freq = new int[10];
        long temp = Math.abs((long) n);
        while (temp > 0) {
            freq[(int) (temp % 10)]++;
            temp /= 10;
        }
        int minFreq = Integer.MAX_VALUE;
        int leastFrequentDigit = -1;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0 && freq[i] < minFreq) {
                minFreq = freq[i];
                leastFrequentDigit = i;
            }
        }
        return leastFrequentDigit;
    }
}
