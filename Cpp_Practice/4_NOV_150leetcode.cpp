// 54. Spiral Matrix
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given an m x n matrix, return all elements of the matrix in spiral order.

 

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]
// Example 2:


// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

// Constraints:

// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 10
// -100 <= matrix[i][j] <= 100

#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& mat) {
        vector<int> result;
        if (mat.empty()) return result;

        int srow = 0, scol = 0;
        int edrow = mat.size(), edcol = mat[0].size();

        while (srow < edrow && scol < edcol) {
            // Top row
            for (int i = scol; i < edcol; ++i) {
                result.push_back(mat[srow][i]);
            }
            srow++;

            // Right column
            for (int i = srow; i < edrow; ++i) {
                result.push_back(mat[i][edcol - 1]);
            }
            edcol--;

            // Bottom row
            if (srow < edrow) {
                for (int i = edcol - 1; i >= scol; --i) {
                    result.push_back(mat[edrow - 1][i]);
                }
                edrow--;
            }

            // Left column
            if (scol < edcol) {
                for (int i = edrow - 1; i >= srow; --i) {
                    result.push_back(mat[i][scol]);
                }
                scol++;
            }
        }

        return result;
    }
};

int main() {
    Solution sol;
    vector<vector<int>> matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    vector<int> result = sol.spiralOrder(matrix);
    for (int num : result) {
        cout << num << " ";
    }
    cout << endl; // Output: 1 2 3 6 9 8 7 4 5
    return 0;
}