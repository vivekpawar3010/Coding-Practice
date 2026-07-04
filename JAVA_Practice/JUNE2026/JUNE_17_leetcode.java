import java.util.Arrays;
import java.util.*;

public class JUNE_17_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] hgt = { 1, 1, 4, 2, 1, 3 };

        int result = sol.heightChecker(hgt);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int heightChecker(int[] hgt) {
        int n = hgt.length;
        int[] exp = hgt.clone();
        Arrays.sort(exp);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (hgt[i] != exp[i]) {
                count++;
            }
        }
        return count;
    }
}
