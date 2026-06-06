1class Solution {
2    public int earliestTime(int[][] tasks) {
3        int mintime = Integer.MAX_VALUE;
4
5        for(int i = 0; i < tasks.length; i++){
6            int sum = tasks[i][0] + tasks[i][1];
7            if(mintime > sum) mintime = sum;
8        }
9        return mintime;
10    }
11}