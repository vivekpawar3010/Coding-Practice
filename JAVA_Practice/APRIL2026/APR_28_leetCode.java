// 3932. Count K-th Roots in a Range
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// You are given three integers l, r, and k.

// An integer y is said to be a perfect kth power if there exists an integer x such that y = xk.

// Return the number of integers y in the range [l, r] (inclusive) that are perfect kth powers.

// Example 1:

// Input: l = 1, r = 9, k = 3

// Output: 2

// Explanation:

// The perfect cubes in the range [1, 9] are:
// 1 = 13
// 8 = 23
// Hence, the answer is 2.
// Example 2:

// Input: l = 8, r = 30, k = 2

// Output: 3

// Explanation:

// The perfect squares in the range [8, 30] are:
// 9 = 32
// 16 = 42
// 25 = 52
// Hence, the answer is 3.

// Constraints:

// 0 <= l <= r <= 109
// 1 <= k <= 30

class Solution {
    public int countKthRoots(int l, int r, int k) {
        int left = rootCount(l - 1, k);
        int right = rootCount(r, k);
        return right - left;
    }

    public static int rootCount(int l, int k) {
        if (l < 0)
            return 0;
        long low = 0;
        long high = l;

        int res = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long val = 1;
            for (int i = 0; i < k; i++) {
                val *= mid;

                if (val > 1000000000L) {
                    break;
                }
            }
            if (val <= l) {
                res = (int) mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) (res + 1);

    }

    public static long power(long x, int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= x;

            if (ans > 1000000000L) {
                return ans;
            }

        }
        return ans;
    }
}

public class APR_28_leetCode {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.countKthRoots(1, 9, 3)); // expected 2
        System.out.println(s.countKthRoots(8, 30, 2)); // expected 3
    }
}
