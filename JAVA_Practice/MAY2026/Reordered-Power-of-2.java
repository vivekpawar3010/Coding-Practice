1class Solution {
2    public boolean reorderedPowerOf2(int n) {
3        // Step 1: Get the digit count array for the input number
4        int[] targetCounts = countDigits(n);
5        
6        for (int i = 0; i < 31; i++) {
7            int powerOf2 = 1 << i;
8            if (java.util.Arrays.equals(targetCounts, countDigits(powerOf2))) {
9                return true;
10            }
11        }
12        
13        return false;
14    }
15    
16    private int[] countDigits(int num) {
17        int[] counts = new int[10];
18        while (num > 0) {
19            counts[num % 10]++;
20            num /= 10;
21        }
22        return counts;
23    }
24}
25