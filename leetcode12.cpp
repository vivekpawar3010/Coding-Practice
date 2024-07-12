class Solution {
public:
    int maximumGain(string s, int x, int y) {
        auto remove_and_score = [](string& s, char a, char b, int points) {
            stack<char> st;
            int score = 0;
            for (char c : s) {
                if (!st.empty() && st.top() == a && c == b) {
                    st.pop();
                    score += points;
                } else {
                    st.push(c);
                }
            }
            string remaining;
            while (!st.empty()) {
                remaining.push_back(st.top());
                st.pop();
            }
            reverse(remaining.begin(), remaining.end());
            return make_pair(remaining, score);
        };
        
        int totalScore = 0;
        
        if (x > y) {
            auto result_ab = remove_and_score(s, 'a', 'b', x);
            totalScore += result_ab.second;
            auto result_ba = remove_and_score(result_ab.first, 'b', 'a', y);
            totalScore += result_ba.second;
        } else {
            auto result_ba = remove_and_score(s, 'b', 'a', y);
            totalScore += result_ba.second;
            auto result_ab = remove_and_score(result_ba.first, 'a', 'b', x);
            totalScore += result_ab.second;
        }
        
        return totalScore;
    }
};
