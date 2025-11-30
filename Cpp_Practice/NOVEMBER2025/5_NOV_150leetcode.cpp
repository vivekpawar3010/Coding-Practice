// 205. Isomorphic Strings
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

// Example 1:

// Input: s = "egg", t = "add"

// Output: true

// Explanation:

// The strings s and t can be made identical by:

// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.
// Example 2:

// Input: s = "foo", t = "bar"

// Output: false

// Explanation:

// The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

// Example 3:

// Input: s = "paper", t = "title"

// Output: true

 

// Constraints:

// 1 <= s.length <= 5 * 104
// t.length == s.length
// s and t consist of any valid ascii character.


#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size()) return false;
        unordered_map<char, char> map1;
        unordered_map<char, char> map2;
        for(int i = 0; i < s.size(); i++){
            char c1 = s[i], c2 = t[i];
            if(map1.count(c1) && map1[c1] != c2) return false;
            if(map2.count(c2) && map2[c2] != c1) return false;
            map1[c1] = c2;
            map2[c2] = c1;
        }
        return true;
    }
};
// class Solution {
// public:
//     bool isIsomorphic(string s, string t) {
//         char map1[256] = {0}, map2[256] = {0}; // ASCII size arrays

//         for (int i = 0; i < s.size(); i++) {
//             if (map1[s[i]] != map2[t[i]]) return false;
//             map1[s[i]] = i + 1;
//             map2[t[i]] = i + 1;
//         }
//         return true;
//     }
// };


int main() {
    Solution sol;
    string s = "egg";
    string t = "add";
    cout << (sol.isIsomorphic(s, t) ? "true" : "false") << endl; // Output: true
    return 0;
}