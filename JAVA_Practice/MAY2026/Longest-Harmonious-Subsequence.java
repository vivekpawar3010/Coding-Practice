1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int findLHS(int[] nums) {
6        Map<Integer, Integer> freq = new HashMap<>();
7        
8        for (int num : nums) {
9            freq.put(num, freq.getOrDefault(num, 0) + 1);
10        }
11
12        int maxLength = 0;
13
14        for (int key : freq.keySet()) {
15            if (freq.containsKey(key + 1)) {
16                int currentLength = freq.get(key) + freq.get(key + 1);
17                maxLength = Math.max(maxLength, currentLength);
18            }
19        }
20
21        return maxLength;
22    }
23}
24