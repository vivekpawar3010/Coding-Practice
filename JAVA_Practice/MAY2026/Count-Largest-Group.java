1class Solution {
2    public int countLargestGroup(int n) {
3        int[] sum = new int[37];
4        for(int i = 1; i <= n; i++) sum[digitSum(i)]++;
5        int max = 0, count = 0;
6        for(int s : sum){
7            if(s > max) {
8                max = s;
9                count = 1;
10            }
11            else if(s == max) count++;
12        }
13
14        return count;
15    }
16
17    int digitSum(int n){
18        int sum = 0; 
19        while(n > 0) {
20            sum += n % 10;
21            n /= 10;
22        }
23        return sum;
24    }
25}