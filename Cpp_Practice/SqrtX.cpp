#include <iostream>
using namespace std;

class Solution {
public:
    int mySqrt(int x) {
        long sqrt , i;
        for( i = 0; i <= x ;i++){
            if(i*i==x){
                return i;
            }
            else if(i*i<x&&(i+1)*(i+1)>x){
                return i;
            }
        }
        return 0;
    }
};

int main() {
    Solution solution;
    int x = 123; // Change x to any value you want to test
    cout << "Square root of " << x << " is: " << solution.mySqrt(x) << endl;
    return 0;
}
