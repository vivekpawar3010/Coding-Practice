public class MAY_28_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] tasks = { { 1, 2 }, { 2, 3 }, { 4, 5 } };

        int result = sol.earliestTime(tasks);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int earliestTime(int[][] tasks) {
        int mintime = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.length; i++) {
            int sum = tasks[i][0] + tasks[i][1];
            if (mintime > sum)
                mintime = sum;
        }
        return mintime;
    }
}