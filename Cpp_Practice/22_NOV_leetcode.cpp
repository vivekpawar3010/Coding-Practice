// 50. Pow(x, n)
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:

// Input: x = 2.10000, n = 3
// Output: 9.26100
// Example 3:

// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

// Constraints:

// -100.0 < x < 100.0
// -231 <= n <= 231-1
// n is an integer.
// Either x is not zero or n > 0.


#include <iostream>
using namespace std;

class Solution {
public:
    double myPow(double x, int n) {
        if(n < 0) {
            n = n * -1;
            double result = recursiveCall(x, n);
            return 1/result;
        }
        return recursiveCall(x, n);
    }
    double recursiveCall(double num, int pow){
        if(num == 0) return 0.0;
        else if(num == 1 || pow == 0) return 1.0;
        else if(pow == 1) return num;
        if(pow % 2 == 0) return myPow(num, pow/2) * myPow(num, pow/2); // for even n 
        else return num * myPow(num, pow/2) * myPow(num, pow/2); // for odd n
    }
};

int main() {
    Solution sol;
    double x = 2.00000;
    int n = 10;
    double result = sol.myPow(x, n);
    return 0;
}