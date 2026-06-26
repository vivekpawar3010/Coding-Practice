1class Solution {
2    public boolean areOccurrencesEqual(String s) {
3        int n = s.length();
4        char[] chArr = s.toCharArray();
5
6        Map<Character, Integer> freq = new HashMap<>();
7
8        for(char c : chArr) {
9            freq.put(c, freq.getOrDefault(c, 0) + 1);
10
11        }
12        int targetFreq = freq.get(chArr[0]);
13        for(int ct : freq.values()){
14            if(targetFreq != ct) return false;
15        }
16        return true;
17    }
18}