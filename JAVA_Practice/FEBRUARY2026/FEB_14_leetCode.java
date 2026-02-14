// 3280. Convert Date to Binary
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.

// date can be written in its binary representation obtained by converting year, month, and day to their binary representations without any leading zeroes and writing them down in year-month-day format.

// Return the binary representation of date.

// Example 1:

// Input: date = "2080-02-29"

// Output: "100000100000-10-11101"

// Explanation:

// 100000100000, 10, and 11101 are the binary representations of 2080, 02, and 29 respectively.

// Example 2:

// Input: date = "1900-01-01"

// Output: "11101101100-1-1"

// Explanation:

// 11101101100, 1, and 1 are the binary representations of 1900, 1, and 1 respectively.

// Constraints:

// date.length == 10
// date[4] == date[7] == '-', and all other date[i]'s are digits.
// The input is generated such that date represents a valid Gregorian calendar date between Jan 1st, 1900 and Dec 31st, 2100 (both inclusive).

import java.util.*;

class Solution {

    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            sb.append(intToBin(str[i]));
            if (i != str.length - 1)
                sb.append("-");
        }

        return sb.toString();
    }

    private String intToBin(String str) {
        int num = Integer.parseInt(str);

        if (num == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            int remainder = num % 2;
            binary.append(remainder);
            num /= 2;
        }

        return binary.reverse().toString();
    }
}

public class FEB_14_leetCode {
public static void main(String[] args) {
    Solution sol = new Solution();
    String date1 = "2080-02-29";
    String date2 = "1900-01-01";

    System.out.println(sol.convertDateToBinary(date1)); // Output: "100000100000-10-11101"
    System.out.println(sol.convertDateToBinary(date2)); // Output: "11101101100-1-1"
}
