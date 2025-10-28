// 14. Longest Common Prefix
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters if it is non-empty.


#include<iostream>
#include<vector>
using namespace std;


class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if(strs.empty()){
            return "";
        }
        string prefix = strs[0];
        for(int j = 0; j < strs.size(); j++){
            string c = strs[j];
            int i =0;
            while(i < prefix.size() && i < c.size() && prefix[i]==c[i]){
                i++;
            }
            prefix = prefix.substr(0,i);
            if(prefix.empty()){
                return "";
            }
        }
        return prefix;
    }
};

int main(){
    Solution sol;
    vector<string> strs1 = {"flower","flow","flight"};
    vector<string> strs2 = {"dog","racecar","car"};

    string result1 = sol.longestCommonPrefix(strs1); // "fl"
    string result2 = sol.longestCommonPrefix(strs2); // ""

    return 0;
}