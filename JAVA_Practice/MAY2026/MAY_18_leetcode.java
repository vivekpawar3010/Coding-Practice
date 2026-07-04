public class MAY_18_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 13;

        int result = sol.countLargestGroup(n);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int countLargestGroup(int n) {
        int[] sum = new int[37];
        for (int i = 1; i <= n; i++)
            sum[digitSum(i)]++;
        int max = 0, count = 0;
        for (int s : sum) {
            if (s > max) {
                max = s;
                count = 1;
            } else if (s == max)
                count++;
        }

        return count;
    }

    int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}