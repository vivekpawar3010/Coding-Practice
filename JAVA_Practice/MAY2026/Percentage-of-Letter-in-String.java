1class Solution {
2    public int percentageLetter(String s, char letter) {
3        int count = 0;
4        for(char a: s.toCharArray()) {
5            if(a == letter) count++;
6        }
7        return count * 100 / s.length();
8
9        
10    }   
11}