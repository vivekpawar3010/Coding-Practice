1class Solution {
2    public int isPrefixOfWord(String sentence, String searchWord) {
3        String[] words = sentence.split("\\s+");
4        
5        for (int i = 0; i < words.length; i++) {
6            String currword = words[i];
7            
8            if (currword.startsWith(searchWord)) {
9                return i + 1; 
10            }
11        }
12        
13        return -1;
14    }
15}
16