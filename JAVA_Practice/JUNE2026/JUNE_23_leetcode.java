import java.util.*;

public class JUNE_23_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candies = { 2, 3, 5, 1, 3 };
        int k = 3;

        List<Boolean> result = sol.kidsWithCandies(candies, k);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int k) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        int largest = 0;
        for (int i = 0; i < n; i++) {
            if (largest <= candies[i]) {
                largest = candies[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (candies[i] + k >= largest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
