public class MAY_25_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcdefghi";
        int k = 3;
        char fill = 'x';

        String[] result = sol.divideString(s, k, fill);
        System.out.println("Result: " + java.util.Arrays.toString(result));
    }
}

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int rem = n % k;
        int len = (n / k) + (rem == 0 ? 0 : 1);

        String[] ans = new String[len];
        for (int i = 0; i < len; i++) {
            if ((i + 1) * k <= n) {
                ans[i] = s.substring(i * k, (i + 1) * k);
            } else {
                ans[i] = s.substring(i * k, n) + String.valueOf(fill).repeat(k - rem);
            }
        }
        return ans;
    }
}