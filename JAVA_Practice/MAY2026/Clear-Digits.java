1class Solution {
2public:
3    string clearDigits(string s) {
4        string out;
5        for(char c : s) {
6            if(!isdigit(c)) {
7                out.push_back(c);
8            }else{
9                if(!out.empty()) out.pop_back();
10            }
11        }
12        return out;
13    }
14};