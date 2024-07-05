class Solution {
public:
    bool threeConsecutiveOdds(vector<int>& arr) {
        int size = arr.size();
        int j=0;
        for(int i = 0; i < size; i++){
            if(arr[i]%2!=0){
                j++;
            }else{
                j=0;
            }
            if(j>=3){
                return true;
                break;
            }
        }
        return false;
        
    }
};