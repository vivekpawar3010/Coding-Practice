// 191. Number of 1 Bits
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

 

// Example 1:

// Input: n = 11

// Output: 3

// Explanation:

// The input binary string 1011 has a total of three set bits.

// Example 2:

// Input: n = 128

// Output: 1

// Explanation:

// The input binary string 10000000 has a total of one set bit.

// Example 3:

// Input: n = 2147483645

// Output: 30

// Explanation:

// The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

 

// Constraints:

// 1 <= n <= 231 - 1
 
#include <iostream>
using namespace std;

class Solution {
public:
    int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
};

int main() {
    Solution sol;
    int n1 = 11;
    int n2 = 128;
    int n3 = 2147483645;

    // Test cases
    int result1 = sol.hammingWeight(n1); // Expected output: 3
    int result2 = sol.hammingWeight(n2); // Expected output: 1
    int result3 = sol.hammingWeight(n3); // Expected output: 30

    return 0;
}