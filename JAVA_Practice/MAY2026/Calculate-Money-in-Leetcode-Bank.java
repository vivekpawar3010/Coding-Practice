1class Solution {
2    public int totalMoney(int n) {
3        int weeks = n / 7;
4        int days = n % 7;
5
6        int money = 0;
7        for(int i = 0; i < weeks; i++){
8            money += 28 + (i * 7);
9        }
10
11        for(int i = 1; i <= days;i++){
12            money += weeks + i;
13        }
14        return money;
15    }
16}