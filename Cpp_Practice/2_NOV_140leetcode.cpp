// 392. Is Subsequence
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false
 

// Constraints:

// 0 <= s.length <= 100
// 0 <= t.length <= 104
// s and t consist only of lowercase English letters.

#include <iostream>
#include <string>
using namespace std;
class Solution {
public:
    bool isSubsequence(string s, string t) {
        if(s.empty() || (s.empty() && t.empty())) return true;
        if(!s.empty() && t.empty()) return false;
        int sidx = 0;
        bool check = false;
        for(int i = 0; i < t.size(); i++) {
            if(s[sidx] == t[i]) {
                sidx++;
                if(sidx >= s.size()){
                    check = true;
                    break;
                }
            }
        }
        return check;
    }
};

int main() {
    Solution sol;
    string s = "abc";
    string t = "ahbgdc";
    bool result = sol.isSubsequence(s, t);
    cout << (result ? "true" : "false") << endl; // Output: true
    return 0;
}