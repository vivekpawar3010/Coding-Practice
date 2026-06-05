1class Solution {
2    public String finalString(String s) {
3        StringBuilder sb = new StringBuilder();
4        
5        for (int i = 0; i < s.length(); i++) {
6            char ch = s.charAt(i);
7            if (ch == 'i') {
8                sb.reverse();
9            } else {
10                sb.append(ch);
11            }
12        }
13        
14        return sb.toString();
15    }
16}