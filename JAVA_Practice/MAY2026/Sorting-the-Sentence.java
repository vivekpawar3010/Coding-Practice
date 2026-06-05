1class Solution {
2    public String sortSentence(String s) {
3        String words[] = s.split("\\s+");
4        int n = words.length;
5
6        String[] res = new String[n];
7
8        for (String word : words) {
9            int x = word.length();
10            
11            int idx = (word.charAt(x - 1) - '0') - 1;
12            
13            res[idx] = word.substring(0, x - 1);
14        }
15
16        return String.join(" ", res);
17    }
18}
19