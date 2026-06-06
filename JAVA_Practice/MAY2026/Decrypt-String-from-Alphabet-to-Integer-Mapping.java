1class Solution {
2    public String freqAlphabets(String s) {
3        StringBuilder sb = new StringBuilder();
4        int i = 0;
5        int n = s.length();
6        
7        while (i < n) {
8            if (i + 2 < n && s.charAt(i + 2) == '#') {
9                int val = Integer.parseInt(s.substring(i, i + 2));
10                sb.append((char) ('a' + val - 1));
11                i += 3; 
12            } else {
13                int val = s.charAt(i) - '0';
14                sb.append((char) ('a' + val - 1));
15                i++; 
16            }
17        }
18        
19        return sb.toString();
20    }
21}