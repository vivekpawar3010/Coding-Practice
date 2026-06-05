1import java.util.Arrays;
2
3public class Solution {
4    public int[] numberGame(int[] v) {
5        int n = v.length;
6        Arrays.sort(v);
7        for (int i = 0; i < n; i += 2) {
8            if (i + 1 < n) {
9                int temp = v[i];
10                v[i] = v[i + 1];
11                v[i + 1] = temp;
12            }
13        }
14        return v;
15    }
16}