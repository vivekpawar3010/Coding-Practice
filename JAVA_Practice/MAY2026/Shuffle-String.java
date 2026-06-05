1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char[] charr = s.toCharArray();
4
5        for(int i = 0; i < indices.length; i++){
6            charr[indices[i]] = s.charAt(i);
7        }
8
9        return new String(charr);
10    }
11}