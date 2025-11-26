// 55. Jump Game
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.

 

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:

// Input: nums = [3,2,1,0,4]
// Output: false
// Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

// Constraints:

// 1 <= nums.length <= 104
// 0 <= nums[i] <= 105

#include <vector>
using namespace std;

class Solution {
public:
    bool canJump(vector<int>& nums) {
        int idx = 0; // furthest index we can reach so far

        for(int i = 0; i < nums.size(); i++) {
            // if the current index is beyound our furthest reachable index,
            // it means we cannot get here, and thus connot proceed further.

            if(idx < i) return false;

            //update the furthest reach using the current position
            idx = max(idx, i + nums[i]);
        }

        // if we never get stuck 
        return true;
    }
};

int main() {
    Solution sol;
    vector<int> nums = {2,3,1,1,4};
    bool result = sol.canJump(nums);
    return 0;
}