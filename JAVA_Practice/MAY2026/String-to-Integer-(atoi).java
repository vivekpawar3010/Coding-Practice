1class Solution {
2    public int myAtoi(String s) {
3        if (s == null || s.isEmpty()) return 0;
4
5        char[] charr = s.toCharArray();
6        int n = charr.length;
7        int i = 0;
8
9        while (i < n && charr[i] == ' ') {
10            i++;
11        }
12
13        if (i == n) return 0;
14
15        boolean isneg = false;
16        if (charr[i] == '-') {
17            isneg = true;
18            i++;
19        } else if (charr[i] == '+') {
20            i++;
21        }
22
23        int ans = 0;
24        while (i < n && charr[i] >= '0' && charr[i] <= '9') {
25            int digit = charr[i] - '0';
26
27            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
28                return isneg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
29            }
30
31            ans = ans * 10 + digit;
32            i++;
33        }
34
35        return isneg ? -ans : ans;
36    }
37}