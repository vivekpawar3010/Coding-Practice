1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        int n = grid.length;
4        int N = n * n;
5        int[] freq = new int[N + 1]; 
6        int rep = -1, mis = -1;
7        
8        for (int i = 0; i < n; i++) {
9            for (int j = 0; j < n; j++) {
10                freq[grid[i][j]]++;
11            }
12        }
13        
14        for (int i = 1; i <= N; i++) {
15            if (freq[i] == 2) rep = i;
16            if (freq[i] == 0) mis = i;
17        }
18        
19        return new int[]{rep, mis};
20    }
21}
22