class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i = 0, j = 0;
        int S = nums.size();
        vector<int> king(S);
        while(j < S){
            if(S == 1){
                break;
            }
            if(nums[j] != 0){
               king[i]=nums[j];
                j++;
                i++;
            }
            else{

                j++;
            }
        }
        if(S != 1){
        nums = vector<int>(S, 0);
        nums.assign(king.begin(),king.end());
        }
        
    }
};
