1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> disappeared = new ArrayList<>();
4        int n = nums.length;
5        int check[] = new int[n];
6        for(int num : nums){
7            check[(num - 1)] = 1;
8        }
9        for(int i = 0 ; i < n; i++){
10            if(check[i] == 0){
11                disappeared.add(i + 1);
12            }
13        }
14        return disappeared;
15
16    }
17}