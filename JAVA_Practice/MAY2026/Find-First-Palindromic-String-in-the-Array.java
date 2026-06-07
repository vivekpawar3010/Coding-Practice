1class Solution {
2    public String firstPalindrome(String[] words) {
3        int n = words.length;
4
5        for(String word : words){
6            String reversed = new StringBuilder(word).reverse().toString();
7            if(word.equals(reversed)){
8                return word;
9            }
10        }
11
12        return "";
13    }
14}