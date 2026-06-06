1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        int n = words.length;
4
5        StringBuilder sb = new StringBuilder();
6        
7        for (int i = 0; i < n; i++) {
8            String s = words[i];
9            int sum = 0;
10            for (char c : s.toCharArray()) {
11                sum += weights[(c - 'a')];
12            }
13            
14            sum = (sum % 26);
15            
16            sb.append((char) ('a' + (25 - sum)));
17        }
18
19        return sb.toString();
20    }
21}
22