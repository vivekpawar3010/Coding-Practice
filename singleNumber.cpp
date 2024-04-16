class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int output;
        int size= nums.size();
        for(int i = 0;i < size; i++){
            int A= count(nums.begin(),nums.end(),nums.at(i));
            if(A==1){
                output = nums.at(i);
            }
        }
        return output;
     
    }
};
