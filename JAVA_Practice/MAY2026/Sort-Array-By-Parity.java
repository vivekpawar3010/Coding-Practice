1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n];
5        int i = 0, j = n - 1;
6        for(int num : nums){
7            if(num % 2 == 0){
8                arr[i++] = num;
9            }else{
10                arr[j--] = num;
11            }
12        }
13        return arr;
14    }
15}