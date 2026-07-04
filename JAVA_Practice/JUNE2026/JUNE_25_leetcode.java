import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class JUNE_25_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };

        int result = sol.findLHS(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxLength = 0;
        for (int key : freq.keySet()) {
            if (freq.containsKey(key + 1)) {
                int currentLength = freq.get(key) + freq.get(key + 1);
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}
