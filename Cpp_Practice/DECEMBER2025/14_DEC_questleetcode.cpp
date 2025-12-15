// Q3. Find All Numbers Disappeared in an Array
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 105
// 1 <= nums[i] <= n
 
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n = nums.size();
        vector<int> check(n + 1, 0);
        vector<int> result;

        // Mark present numbers
        for (int num : nums) {
            check[num] = 1;
        }

        // Find missing numbers
        for (int i = 1; i <= n; i++) {
            if (check[i] == 0) {
                result.push_back(i);
            }
        }

        return result;
    }
};


int main() {
    Solution sol;
    vector<int> nums = {4, 3, 2, 7, 8, 2, 3, 1};
    vector<int> missingNumbers = sol.findDisappearedNumbers(nums);

    cout << "Missing numbers: ";
    for (int num : missingNumbers) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}