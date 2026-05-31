1class Solution {
2public:
3    int findMaxConsecutiveOnes(vector<int>& nums) {
4        int result = 0;
5        int temp = 0;
6        for(int i = 0; i < nums.size(); i++) {
7            if(nums[i] == 1){
8                temp++;
9            }else{
10                result = max(temp, result);
11                temp = 0;
12            }
13        }
14        result = max(temp, result);
15        return result;
16    }
17};