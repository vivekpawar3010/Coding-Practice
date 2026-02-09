// 1108. Defanging an IP Address
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given a valid (IPv4) IP address, return a defanged version of that IP address.

// A defanged IP address replaces every period "." with "[.]".

// Example 1:

// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
// Example 2:

// Input: address = "255.100.50.0"
// Output: "255[.]100[.]50[.]0"

// Constraints:

// The given address is a valid IPv4 address.

import java.util.*;

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();

        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                result.append("[.]");
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

public class FEB_9_leetCode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String address1 = "1.1.1.1";
        System.out.println(solution.defangIPaddr(address1));
    }
}
