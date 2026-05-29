1
2class Solution {
3public:
4    string reverseParentheses(string s) {
5        stack<int> st;
6
7        for (int i = 0; i < s.size(); i++) {
8            if (s[i] =='(') {
9                st.push(i);
10            } else if (s[i]== ')') {
11                int j = st.top();
12                st.pop();
13                reverse(s.begin() + j + 1, s.begin() + i);
14            }
15        }
16
17        string result;
18        for (char c : s) {
19            if (c != '(' && c != ')') {
20                result += c;
21            }
22        }
23
24        return result;
25    }
26};