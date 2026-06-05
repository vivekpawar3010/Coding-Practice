1class Solution {
2    public String toLowerCase(String s) {
3        char[] charr = s.toCharArray();
4        for(int i = 0; i < charr.length; i++){
5            if(charr[i] <= 'Z' && charr[i] >= 'A'){
6                charr[i] = (char)(charr[i] + 32);
7            }
8        }
9        return new String(charr);
10    }
11}