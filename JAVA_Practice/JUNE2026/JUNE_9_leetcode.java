import java.util.*;

public class JUNE_9_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";

        int result = sol.strStr(haystack, needle);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle))
            return 0;
        int hn = haystack.length();
        int nn = needle.length();
        for (int i = 0; i <= hn - nn; i++) {
            if (haystack.substring(i, i + nn).equals(needle))
                return i;
        }
        return -1;
    }
}