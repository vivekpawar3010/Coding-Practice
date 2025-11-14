// 74. Search a 2D Matrix
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

 

// Example 1:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
// Example 2:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false
 

// Constraints:

// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 100
// -104 <= matrix[i][j], target <= 104

#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& mat, int trgt) {
        int r = mat.size(), c = mat[0].size();

        int strow = 0, edrow = r - 1;

        while (strow <= edrow) {
            int midrow = strow + (edrow - strow) / 2;

            if (trgt >= mat[midrow][0] && trgt <= mat[midrow][c - 1]) {
                // Binary search within the selected row
                int low = 0, high = c - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (mat[midrow][mid] == trgt) {
                        return true;
                    } else if (trgt < mat[midrow][mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                // Not found in the identified row
                return false;
            } else if (trgt < mat[midrow][0]) {
                edrow = midrow - 1;
            } else {
                strow = midrow + 1;
            }
        }
        // Not found in any row
        return false;
    }
};

int main() {
    Solution sol;
    vector<vector<int>> matrix = {
        {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}
    };
    int target = 3;
    cout << (sol.searchMatrix(matrix, target) ? "true" : "false") << endl; // Output: true
    return 0;
}