// Q2. How Many Numbers Are Smaller Than the Current Number
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

// Return the answer in an array.

 

// Example 1:

// Input: nums = [8,1,2,2,3]
// Output: [4,0,1,1,3]
// Explanation: 
// For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
// For nums[1]=1 does not exist any smaller number than it.
// For nums[2]=2 there exist one smaller number than it (1). 
// For nums[3]=2 there exist one smaller number than it (1). 
// For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
// Example 2:

// Input: nums = [6,5,4,8]
// Output: [2,1,0,3]
// Example 3:

// Input: nums = [7,7,7,7]
// Output: [0,0,0,0]
 

// Constraints:

// 2 <= nums.length <= 500
// 0 <= nums[i] <= 100


#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(nums[i] > nums[j]) result[i]++;
            }
        }
        return result;
    }
};

int main() {
    Solution sol;
    vector<int> nums = {8, 1, 2, 2, 3};
    vector<int> result = sol.smallerNumbersThanCurrent(nums);
    cout << "Result: ";
    for(int count : result) {
        cout << count << " ";
    }
    cout << endl;
    return 0;
}