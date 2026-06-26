1class Solution {
2    public boolean hasSpecialSubstring(String s, int k) {
3        int n = s.length();
4        int count = 1;
5
6        for (int i = 1; i < n; ++i) {
7            if (s.charAt(i) == s.charAt(i - 1)) {
8                count++;
9            } else {
10                if (count == k) {
11                    return true;
12                }
13                count = 1;
14            }
15        }
16        
17        return count == k;
18    }
19}
20