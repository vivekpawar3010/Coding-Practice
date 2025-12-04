// 70. Climbing Stairs
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step
 

// Constraints:

// 1 <= n <= 45

#include <iostream>
using namespace std

class Solution {
public:
    int climbStairs(int n) {
        if (n <= 3) return n;

        int step1 = 3;
        int step2 = 2;
        int currentsteps = 0;

        for(int i = 3; i < n; i++) {
            currentsteps = step1 + step2;
            step2 = step1;
            step1 = currentsteps;
        }
        return currentsteps;
    }
};

int main() {
    Solution sol;
    int n = 5; // Example input
    int result = sol.climbStairs(n);
    return 0;
}