1class Solution {
2    public String gcdOfStrings(String str1, String str2) {
3        if (!(str1 + str2).equals(str2 + str1)) {
4            return "";
5        }
6        
7        int gcdLength = gcd(str1.length(), str2.length());
8        
9        return str1.substring(0, gcdLength);
10    }
11    
12    private int gcd(int a, int b) {
13        return b == 0 ? a : gcd(b, a % b);
14    }
15}
16