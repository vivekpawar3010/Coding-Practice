public class MAY_27_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] startL = { 1, 3 };
        int[] durL = { 2, 2 };
        int[] startW = { 2 };
        int[] durW = { 1 };

        int result = sol.earliestFinishTime(startL, durL, startW, durW);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int earliestFinishTime(int[] startL, int[] durL, int[] startW, int[] durW) {
        int minL = 3000, minW = minL, res = minW;
        int n = startL.length;
        int m = startW.length;

        for (int i = 0; i < n; i++)
            minL = Math.min(minL, startL[i] + durL[i]);

        for (int i = 0; i < m; i++) {
            minW = Math.min(minW, startW[i] + durW[i]);
            res = Math.min(res, Math.max(minL, startW[i]) + durW[i]);
        }

        for (int i = 0; i < n; i++)
            res = Math.min(res, Math.max(minW, startL[i]) + durL[i]);

        return res;
    }
}