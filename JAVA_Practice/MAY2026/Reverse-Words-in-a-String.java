1class Solution {
2    public String reverseWords(String s) {
3        s = s.trim();
4        String[] words = s.split("\\s+");
5        String news = "";
6        for(String word : words){
7            news = word + " " +news;
8        }
9        return news.trim();
10    }
11}