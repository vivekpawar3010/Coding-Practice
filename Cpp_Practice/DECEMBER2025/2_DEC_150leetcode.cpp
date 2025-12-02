
// 3. Longest Substring Without Repeating Characters
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given a string s, find the length of the longest substring without duplicate characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.

#include <string>
using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int i = 0; // Left pointer of the sliding window
        int result = 0;
        string temp = "";

        for (int j = 0; j < s.size(); j++) {
            // If s[j] is already in the current window, shrink window from the left
            while (temp.find(s[j]) != string::npos) {
                temp.erase(0, 1); // Remove first character
                i++;
            }

            temp.push_back(s[j]); // Add current character to the window
            result = max(result, j - i + 1); // Update max length
        }

        return result;
    }
};

int main() {
    Solution sol;
    string testStr = "abcabcbb";
    int length = sol.lengthOfLongestSubstring(testStr);
    // Expected output: 3
    return 0;
}