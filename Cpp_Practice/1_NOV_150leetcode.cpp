// 68. Text Justification
// Solved
// Hard
// Topics
// premium lock icon
// Companies
// Given an array of strings words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.

// You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.

// Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

// For the last line of text, it should be left-justified, and no extra space is inserted between words.

// Note:

// A word is defined as a character sequence consisting of non-space characters only.
// Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
// The input array words contains at least one word.
 

// Example 1:

// Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
// Output:
// [
//    "This    is    an",
//    "example  of text",
//    "justification.  "
// ]
// Example 2:

// Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
// Output:
// [
//   "What   must   be",
//   "acknowledgment  ",
//   "shall be        "
// ]
// Explanation: Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
// Note that the second line is also left-justified because it contains only one word.
// Example 3:

// Input: words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"], maxWidth = 20
// Output:
// [
//   "Science  is  what we",
//   "understand      well",
//   "enough to explain to",
//   "a  computer.  Art is",
//   "everything  else  we",
//   "do                  "
// ]
 

// Constraints:

// 1 <= words.length <= 300
// 1 <= words[i].length <= 20
// words[i] consists of only English letters and symbols.
// 1 <= maxWidth <= 100
// words[i].length <= maxWidth


#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    vector<string> fullJustify(vector<string>& words, int maxWidth) {
        vector<string> result;
        int n = words.size();
        int i = 0;

        while (i < n) {
            int j = i, lineLength = 0;

            while (j < n && lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                ++j;
            }

            int spaces = maxWidth - lineLength;
            int numberOfWords = j - i;

            if (j == n || numberOfWords == 1) {
                string line = words[i];
                for (int k = i + 1; k < j; ++k) {
                    line += " " + words[k];
                }
                line += string(spaces - (numberOfWords - 1), ' ');
                result.push_back(line);
            } else {
                int spaceBetweenWords = spaces / (numberOfWords - 1);
                int extraSpaces = spaces % (numberOfWords - 1);
                string line = words[i];

                for (int k = i + 1; k < j; ++k) {
                    line += string(spaceBetweenWords + (extraSpaces-- > 0 ? 1 : 0), ' ');
                    line += words[k];
                }
                result.push_back(line);
            }

            i = j;
        }

        return result;
    }
};

int main() {
    Solution sol;
    vector<string> words = {"This", "is", "an", "example", "of", "text", "justification."};
    int maxWidth = 16;
    vector<string> justifiedText = sol.fullJustify(words, maxWidth);

    for (const string& line : justifiedText) {
        cout << "\"" << line << "\"" << endl;
    }

    return 0;
}