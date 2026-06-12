1class Solution {
2    public int findLucky(int[] arr) {
3        Set<Integer> unique = new HashSet<>();
4        int maxnum = -1;
5        for (int num : arr) {
6            unique.add(num);
7        }
8        for(int num : unique){
9            int freq = 0;
10            for(int num1 : arr){
11                if(num1 == num) freq++;
12            }
13            if(freq == num && num > maxnum) maxnum = num; 
14        }
15        return maxnum;
16    }
17}