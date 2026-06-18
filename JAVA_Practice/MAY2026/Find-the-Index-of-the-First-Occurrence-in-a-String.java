1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(haystack.equals(needle)) return 0;
4
5        int hn = haystack.length();
6        int nn = needle.length();
7
8        for(int i = 0; i <= hn - nn; i++){
9            if(haystack.substring(i,i + nn).equals(needle)) return i;
10        }
11        return -1;
12    }
13}