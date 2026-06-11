1class Solution {
2    public boolean isPrefixString(String s, String[] words) {
3        StringBuilder sb = new StringBuilder();
4        
5        for (String word : words) {
6            sb.append(word);
7            
8            if (sb.length() == s.length()) {
9                return sb.toString().equals(s);
10            }
11            
12            if (sb.length() > s.length()) {
13                return false;
14            }
15        }
16        
17        return false;
18    }
19}
20