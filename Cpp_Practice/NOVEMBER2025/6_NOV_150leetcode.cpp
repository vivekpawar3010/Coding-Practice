// 290. Word Pattern
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

// Each letter in pattern maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same letter.
 

// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"

// Output: true

// Explanation:

// The bijection can be established as:

// 'a' maps to "dog".
// 'b' maps to "cat".
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"

// Output: false

// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"

// Output: false

 

// Constraints:

// 1 <= pattern.length <= 300
// pattern contains only lower-case English letters.
// 1 <= s.length <= 3000
// s contains only lowercase English letters and spaces ' '.
// s does not contain any leading or trailing spaces.
// All the words in s are separated by a single space.

#include <iostream>
#include <unordered_map>
#include <vector>
#include <string>
#include <sstream>
using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> charToWord;
        unordered_map<string, char> wordToChar;
        vector<string> words;
        
        // Split the string `s` into words
        stringstream ss(s);
        string word;
        while (ss >> word) {
            words.push_back(word);
        }
        
        // Check if pattern length matches the number of words
        if (pattern.size() != words.size()) return false;
        
        // Iterate through pattern and words
        for (int i = 0; i < pattern.size(); i++) {
            char c = pattern[i];
            string w = words[i];

            // Check character-to-word mapping
            if (charToWord.count(c)) {
                if (charToWord[c] != w) return false;
            } else {
                charToWord[c] = w;
            }

            // Check word-to-character mapping
            if (wordToChar.count(w)) {
                if (wordToChar[w] != c) return false;
            } else {
                wordToChar[w] = c;
            }
        }
        
        return true;
    }
};

int main() {
    Solution solution;
    string pattern = "abba";
    string s = "dog cat cat dog";
    
    bool result = solution.wordPattern(pattern, s);
    cout << (result ? "true" : "false") << endl; // Output: true
    
    return 0;
}