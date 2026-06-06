1class Solution {
2    public String replaceDigits(String s) {
3        char[] charr = s.toCharArray();
4        
5        for (int i = 1; i < charr.length; i += 2) {
6            charr[i] = shift(charr[i - 1], charr[i] - '0');
7        }
8
9        return new String(charr);
10    }
11
12    private char shift(char c, int n) {
13        return (char)(c + n);
14    }
15}