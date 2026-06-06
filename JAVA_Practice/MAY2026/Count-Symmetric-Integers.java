1class Solution {
2    public int countSymmetricIntegers(int low, int high) {
3        int count = 0; 
4
5        for (int num = low; num <= high; num++) {
6            String str = Integer.toString(num); 
7            int len = str.length();
8
9            if (len % 2 != 0) continue;
10
11            int half = len / 2;
12            int leftSum = 0;
13            int rightSum = 0;
14
15            for (int i = 0; i < half; i++) {
16                leftSum += str.charAt(i) - '0';
17            }
18
19            for (int i = half; i < len; i++) {
20                rightSum += str.charAt(i) - '0';
21            }
22
23            // ☯️ If chakra is balanced, count it
24            if (leftSum == rightSum) {
25                count++;
26            }
27        }
28
29        return count; 
30    }
31}