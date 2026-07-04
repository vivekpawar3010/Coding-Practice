import java.util.*;

public class JUNE_4_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 2, 2, 3, 4 };

        int result = sol.findLucky(arr);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int findLucky(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        int maxnum = -1;
        for (int num : arr) {
            unique.add(num);
        }
        for (int num : unique) {
            int freq = 0;
            for (int num1 : arr) {
                if (num1 == num)
                    freq++;
            }
            if (freq == num && num > maxnum)
                maxnum = num;
        }
        return maxnum;
    }
}
