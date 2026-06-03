1class Solution {
2    public void reverseString(char[] s) {
3        int n = s.length;
4        for(int i = 0; i < n / 2; i++){
5            char temp = s[i];
6            s[i] = s[n - i - 1];
7            s[n - 1 -i] = temp;
8        }
9    }
10}