1class Solution {
2public:
3    int hammingWeight(int n) {
4        int count = 0;
5        while (n != 0) {
6            if ((n & 1) == 1) {
7                count++;
8            }
9            n >>= 1;
10        }
11        return count;
12    }
13};