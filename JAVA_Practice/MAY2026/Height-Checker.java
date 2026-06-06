1import java.util.Arrays;
2
3class Solution {
4    public int heightChecker(int[] hgt) {
5        int n = hgt.length;
6
7        int[] exp = hgt.clone();
8        
9        Arrays.sort(exp);
10        
11        int count = 0;
12        for (int i = 0; i < n; i++) {
13            if (hgt[i] != exp[i]) {
14                count++;
15            }
16        }
17        
18        return count;
19    }
20}