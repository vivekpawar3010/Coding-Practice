1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if (s.length() != t.length()) return false;
4        
5        Map<Character, Character> map1 = new HashMap<>();
6        Map<Character, Character> map2 = new HashMap<>();
7        
8        for (int i = 0; i < s.length(); i++) {
9            char c1 = s.charAt(i);
10            char c2 = t.charAt(i);
11            
12            if (map1.containsKey(c1) && map1.get(c1) != c2) return false;
13            if (map2.containsKey(c2) && map2.get(c2) != c1) return false;
14            
15            map1.put(c1, c2);
16            map2.put(c2, c1);
17        }
18        return true;
19    }
20}