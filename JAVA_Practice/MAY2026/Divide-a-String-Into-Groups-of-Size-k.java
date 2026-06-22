1class Solution {
2    public String[] divideString(String s, int k, char fill) {
3        int n = s.length();
4        int rem = n % k;
5        int len = (n / k) + (rem == 0 ? 0 : 1); 
6        
7        String[] ans = new String[len];
8        for (int i = 0; i < len; i++) {
9            if ((i + 1) * k <= n) { 
10                ans[i] = s.substring(i * k, (i + 1) * k);
11            } else {
12                ans[i] = s.substring(i * k, n) + String.valueOf(fill).repeat(k - rem);
13            }
14        }
15        return ans;
16    }
17}
18