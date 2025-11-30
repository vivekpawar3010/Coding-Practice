
// Code
// Note
// Note
// Testcase
// Testcase
// Test Result
// 28. Find the Index of the First Occurrence in a String
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

// Constraints:

// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.

#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    int strStr(string haystack, string needle) {
        if(haystack == needle) return 0; // Correct but not necessary
        int hsize = haystack.size();
        int nsize = needle.size();
        for(int i = 0; i <= hsize - nsize; i++){ // Fixed loop condition
            if(haystack.substr(i, nsize) == needle){
                return i;
            }
        }
        return -1;
    }
};

int main() {
    Solution sol;
    string haystack = "sadbutsad";
    string needle = "sad";
    cout << sol.strStr(haystack, needle) << endl; // Output: 0
    return 0;
}