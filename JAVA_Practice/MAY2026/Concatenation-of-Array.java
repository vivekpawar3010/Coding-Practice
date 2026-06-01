1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n = nums.length;
4
5        int[] arr = new int[2 * n];
6        for(int i = 0; i < 2 * n; i++){
7            arr[i] = nums[(i % n)];
8        }
9
10        return arr;
11    }
12}