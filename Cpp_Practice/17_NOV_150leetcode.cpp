// 67. Add Binary
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two binary strings a and b, return their sum as a binary string.

 

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"
 

// Constraints:

// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.

#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    string addBinary(string a, string b) {
        string result;
        int s1 = a.size();
        int s2 = b.size();
        int maxSize = max(s1, s2);

        // Make both strings of the same length by padding with '0's
        while (a.size() < maxSize) a.insert(a.begin(), '0');
        while (b.size() < maxSize) b.insert(b.begin(), '0');

        int remin = 0;
        for (int i = maxSize - 1; i >= 0; i--) {
            int sum = (a[i] - '0') + (b[i] - '0') + remin;
            remin = sum / 2;
            result.insert(result.begin(), (sum % 2) + '0');
        }
        
        if (remin) {
            result.insert(result.begin(), '1');
        }

        return result;
    }
};

int main() {
    Solution sol;
    string a = "1010";
    string b = "1011";
    cout << sol.addBinary(a, b) << endl; // Output: "10101"
    return 0;
}