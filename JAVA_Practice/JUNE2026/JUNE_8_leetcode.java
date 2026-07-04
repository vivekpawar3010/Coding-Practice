import java.util.*;

public class JUNE_8_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] gain = { -5, 1, 5, 0, -7 };

        int result = sol.largestAltitude(gain);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int maxalt = 0;
        int curr = 0;
        for (int point : gain) {
            curr += point;
            if (maxalt < curr)
                maxalt = curr;
        }
        return maxalt;
    }
}
