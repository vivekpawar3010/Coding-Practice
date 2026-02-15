// 67. Add Binary
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two binary strings a and b, return their sum as a binary string.

 

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"
 

// Constraints:

// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.


class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int s1 = a.length();
        int s2 = b.length();
        int maxSize = Math.max(s1, s2);

        // Make both strings of same length by padding with '0'
        while (a.length() < maxSize) {
            a = "0" + a;
        }

        while (b.length() < maxSize) {
            b = "0" + b;
        }

        int carry = 0;

        for (int i = maxSize - 1; i >= 0; i--) {
            int sum = (a.charAt(i) - '0') + 
                      (b.charAt(i) - '0') + 
                      carry;

            carry = sum / 2;

            result.insert(0, sum % 2);
        }

        if (carry == 1) {
            result.insert(0, 1);
        }

        return result.toString();
    }
}


public FEB_15_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String date = "2080-02-29";
        String result = sol.convertDateToBinary(date);
        System.out.println(result);
    }
}