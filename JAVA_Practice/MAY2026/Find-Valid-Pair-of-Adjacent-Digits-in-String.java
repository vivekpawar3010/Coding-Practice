1class Solution {
2    public String findValidPair(String s) {
3        Map<Character, Integer> freq = new HashMap<>();
4        for (char c : s.toCharArray()) {
5            freq.put(c, freq.getOrDefault(c, 0) + 1);
6        }
7
8        for (int i = 0; i < s.length() - 1; i++) {
9            char first = s.charAt(i);
10            char second = s.charAt(i + 1);
11
12            if (first != second) {
13                int firstValue = first - '0';
14                int secondValue = second - '0';
15
16                if (freq.get(first) == firstValue && freq.get(second) == secondValue) {
17                    return "" + first + second; 
18                }
19            }
20        }
21
22        return "";
23    }
24}
25