1import java.util.ArrayList;
2
3class Solution {
4    public int[] getSneakyNumbers(int[] nums) {
5        ArrayList<Integer> ans = new ArrayList<>();
6        int n = nums.length;
7        
8        // Loop through every number to find duplicates
9        for (int num : nums) {
10            int freq = 0;
11            
12            // Inner loop to count how many times 'num' appears
13            for (int i = 0; i < n; i++) {
14                if (nums[i] == num) {
15                    freq++;
16                }
17            }
18            
19            if (freq > 1 && !ans.contains(num)) {
20                ans.add(num); 
21            }
22        }
23        
24        int[] result = new int[ans.size()];
25        for (int i = 0; i < ans.size(); i++) {
26            result[i] = ans.get(i);
27        }
28        
29        return result;
30    }
31}