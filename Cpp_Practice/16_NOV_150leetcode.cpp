// 4. Median of Two Sorted Arrays
// Solved
// Hard
// Topics
// premium lock icon
// Companies
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

// Constraints:

// nums1.length == m
// nums2.length == n
// 0 <= m <= 1000
// 0 <= n <= 1000
// 1 <= m + n <= 2000
// -106 <= nums1[i], nums2[i] <= 106

#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> merged;
        int i = 0, j = 0;
        int n1 = nums1.size(), n2 = nums2.size();

        // Merge the two sorted arrays
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) merged.push_back(nums1[i++]);
            else merged.push_back(nums2[j++]);
        }

        // Add remaining elements
        while (i < n1) merged.push_back(nums1[i++]);
        while (j < n2) merged.push_back(nums2[j++]);

        int n = merged.size();
        // If even length → average of two middle elements
        if (n % 2 == 0)
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        else
            return merged[n / 2];
    }
};

int main() {
    Solution sol;
    vector<int> nums1 = {1, 3};
    vector<int> nums2 = {2};
    cout << "Median: " << sol.findMedianSortedArrays(nums1, nums2) << endl; // Output: 2.0
    return 0;
}