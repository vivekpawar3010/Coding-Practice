// 20. Valid Parentheses
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

// Example 5:

// Input: s = "([)]"

// Output: false

 

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.

#include <iostream>
#include <stack>
#include <string>
using namespace std;


class Solution {
public:
    bool isValid(string s) {
        stack<char> st;

        for (char ch : s) {
            if (ch == '(' || ch == '{' || ch == '[') {
               st.push(ch); // Push opening brackets
            } else {
                if (st.empty())
                    return false; // Extra closing bracket

                char top = st.top();
                if ((ch == ')' && top == '(') || (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    st.pop(); // Pop matching bracket
                } else {
                    return false; // Mismatched bracket
                }
            }
        }

        return st.empty(); // If stack is empty, it's balanced
    }
};

int main() {
    Solution solution;
    string s = "([])";
    bool result = solution.isValid(s);
    cout << (result ? "true" : "false") << endl; // Output: true
    return 0;
}