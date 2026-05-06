// 3919. Minimum Cost to Move Between Indices
// Solved
// Medium
// premium lock icon
// Companies
// Hint
// You are given an integer array nums where nums is strictly increasing.

// For each index x, let closest(x) be the adjacent index such that abs(nums[x] - nums[y]) is minimized. If both adjacent indices exist and give the same difference, choose the smaller index.

// From any index x, you can move in two ways:

// To any index y with cost abs(nums[x] - nums[y]), or
// To closest(x) with cost 1.
// You are also given a 2D integer array queries, where each queries[i] = [li, ri].

// For each query, calculate the minimum total cost to move from index li to index ri.

// Return an integer array ans, where ans[i] is the answer for the ith query.

// The absolute difference between two values x and y is defined as abs(x - y).

// Example 1:

// Input: nums = [-5,-2,3], queries = [[0,2],[2,0],[1,2]]

// Output: [6,2,5]

// Explanation:​​​​​​​​​​​​​​​​​​​​

// The closest indices are [1, 0, 1] respectively.
// For [0, 2], the path 0 → 1 → 2 uses a closest move from index 0 to 1 with cost 1 and a move from index 1 to 2 with cost |-2 - 3| = 5, giving total 1 + 5 = 6.
// For [2, 0], the path 2 → 1 → 0 uses two closest moves from index 2 to 1 and from index 1 to 0, each with cost 1, giving total 2.
// For [1, 2], the direct move from index 1 to index 2 has cost |-2 - 3| = 5, which is optimal.
// Thus, ans = [6, 2, 5].

// Example 2:

// Input: nums = [0,2,3,9], queries = [[3,0],[1,2],[2,0]]

// Output: [4,1,3]

// Explanation:

// The closest indices are [1, 2, 1, 2] respectively.
// For [3, 0], the path 3 → 2 → 1 → 0 uses closest moves from index 3 to 2 and from 2 to 1, each with cost 1, and a move from 1 to 0 with cost |2 - 0| = 2, giving total 1 + 1 + 2 = 4.
// For [1, 2], the closest move from index 1 to 2 has cost 1.
// For [2, 0], the path 2 → 1 → 0 uses a closest move from index 2 to 1 with cost 1 and a move from 1 to 0 with cost |2 - 0| = 2, giving total 1 + 2 = 3.
// Thus, ans = [4, 1, 3].

// Constraints:

// 2 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is strictly increasing
// 1 <= queries.length <= 105
// queries[i] = [li, ri]​​​​​​​
// 0 <= li, ri < nums.length

public class APR_16_leetCode {
    public static void main(String[] args) {
        int[] nums = { -5, -2, 3 };
        int[][] queries = { { 0, 2 }, { 2, 0 }, { 1, 2 } };
        int[] result = Solution.minCost(nums, queries);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        } // Output: [6, 2, 5]
    }
}

class Solution {
    public static int[] minCost(int[] nums, int[][] queries) {
        int n = nums.length;

        int[] clo = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                clo[i] = 1;
            } else if (i == n - 1) {
                clo[i] = n - 2;
            } else {
                int leftd = nums[i] - nums[i - 1];
                int rightd = nums[i + 1] - nums[i];

                if (leftd <= rightd) {
                    clo[i] = i - 1;
                } else {
                    clo[i] = i + 1;
                }
            }
        }

        long[] ltor = new long[n];

        for (int i = 1; i < n; i++) {
            if (clo[i - 1] == i)
                ltor[i] = ltor[i - 1] + 1;
            else
                ltor[i] = ltor[i - 1] + (nums[i] - nums[i - 1]);
        }

        long[] rtol = new long[n];

        for (int i = n - 2; i >= 0; i--) {
            if (clo[i + 1] == i)
                rtol[i] = rtol[i + 1] + 1;
            else
                rtol[i] = rtol[i + 1] + (nums[i + 1] - nums[i]);
        }

        int len = queries.length;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            int f = queries[i][0];
            int s = queries[i][1];

            if (f < s) {
                ans[i] = (int) (ltor[s] - ltor[f]);
            } else {
                ans[i] = (int) (rtol[s] - rtol[f]);
            }
        }

        return ans;
    }
}