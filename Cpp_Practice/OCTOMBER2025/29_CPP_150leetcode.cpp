// 151. Reverse Words in a String
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
// Example 3:

// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

// Constraints:

// 1 <= s.length <= 104
// s contains English letters (upper-case and lower-case), digits, and spaces ' '.
// There is at least one word in s.
 

// Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?

#include <iostream>
#include <vector>
#include <string>
#include <sstream>
#include <algorithm>
using namespace std;
class Solution {
public:
    string reverseWords(string s) {
        string word;
        std::vector<std::string> words;
        std::stringstream ss(s);
        while(ss >> word){
            words.push_back(word);
        }
        // for (char c : s) {
        //     if (c == ' ') {
        //         if (!word.empty()) {
        //             words.push_back(word);
        //             word.clear();
        //         }
        //     } else {
        //         word += c;
        //     }
        // }
        // if (!word.empty()) {
        //     words.push_back(word);
        // }
        string out;
        int size = words.size();
        std::reverse(words.begin(), words.end());
        for (int i = 0; i < size; i++) {
            out += words[i];
            if (i != size - 1) {
                out += ' ';
            }
        }
        return out;
    }
};

int main() {
    Solution sol;
    string s1 = "the sky is blue";
    string s2 = "  hello world  ";
    string s3 = "a good   example";

    cout << "\"" << sol.reverseWords(s1) << "\"" << endl; // "blue is sky the"
    cout << "\"" << sol.reverseWords(s2) << "\"" << endl; // "world hello"
    cout << "\"" << sol.reverseWords(s3) << "\"" << endl; // "example good a"

    return 0;
}