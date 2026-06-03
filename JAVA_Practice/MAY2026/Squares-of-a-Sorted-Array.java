1class Solution {
2public:
3    vector<int> sortedSquares(vector<int>& nums) {
4        int n = nums.size();
5        vector<int> result(n, 0);
6        int i = 0, j = n - 1;
7        int tp = j;
8
9        while (i <= j) {
10            int a = nums[i] * nums[i];
11            int b = nums[j] * nums[j];
12
13            if (a > b) {
14                result[tp--] = a;
15                i++;
16            } else {
17                result[tp--] = b;
18                j--;
19            }
20        }
21        return result;
22    }
23};
24