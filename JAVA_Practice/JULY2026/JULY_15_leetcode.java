// 3658. GCD of Odd and Even Sums
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:

// sumOdd: the sum of the smallest n positive odd numbers.

// sumEven: the sum of the smallest n positive even numbers.

// Return the GCD of sumOdd and sumEven.

// Example 1:

// Input: n = 4

// Output: 4

// Explanation:

// Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
// Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20
// Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.

// Example 2:

// Input: n = 5

// Output: 5

// Explanation:

// Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25
// Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30
// Hence, GCD(sumOdd, sumEven) = GCD(25, 30) = 5.

// Constraints:

// 1 <= n <= 10​​​​​​​00
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = n * (n + 1);
        int b = n * n;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}

public class JULY_15_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 4;
        int result1 = sol.gcdOfOddEvenSums(n1);
        System.out.println("GCD of Odd and Even Sums for n = " + n1 + ": " + result1); // Output: 4

        int n2 = 5;
        int result2 = sol.gcdOfOddEvenSums(n2);
        System.out.println("GCD of Odd and Even Sums for n = " + n2 + ": " + result2); // Output: 5
    }
}
