1class Solution {
2    public int getLeastFrequentDigit(int n) {
3        if (n == 0) return 0;
4
5        int[] freq = new int[10];
6        
7        long temp = Math.abs((long) n);
8        while (temp > 0) {
9            freq[(int) (temp % 10)]++;
10            temp /= 10;
11        }
12
13        int minFreq = Integer.MAX_VALUE;
14        int leastFrequentDigit = -1;
15
16        for (int i = 0; i < 10; i++) {
17            if (freq[i] > 0 && freq[i] < minFreq) {
18                minFreq = freq[i];
19                leastFrequentDigit = i; 
20            }
21        }
22
23        return leastFrequentDigit;
24    }
25}
26