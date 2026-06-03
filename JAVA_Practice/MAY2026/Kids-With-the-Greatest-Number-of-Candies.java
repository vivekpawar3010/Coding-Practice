1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int k) {
3        int n = candies.length;
4        List<Boolean> result = new ArrayList<>();
5        
6        int largest = 0;
7        for (int i = 0; i < n; i++) {
8            if (largest <= candies[i]) {
9                largest = candies[i];
10            }
11        }
12
13        for (int i = 0; i < n; i++) {
14            if (candies[i] + k >= largest) {
15                result.add(true);
16            } else {
17                result.add(false);
18            }
19        }
20
21        return result;
22    }
23}