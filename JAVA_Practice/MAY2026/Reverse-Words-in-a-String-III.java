1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split("\\s+");
4        int n = words.length;
5
6        for(int i = 0; i < n; i++){
7            words[i] = new StringBuilder(words[i]).reverse().toString();
8        }
9
10        return String.join(" ", words);
11    }
12
13    
14}