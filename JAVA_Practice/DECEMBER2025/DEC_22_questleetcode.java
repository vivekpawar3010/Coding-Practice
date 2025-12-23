// Q3. Palindrome Number
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer x, return true if x is a palindrome, and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        // int check = 0, copy = x;   
            // insted of this lets calcualte only half part
            int reversedHalf  = 0; 

        // while(copy > 0) {
        //     check *= 10;
        //     int temp = copy % 10;
        //     copy /= 10;
        //     check += temp;
        // }

        //now find only reversehalf value
        while(x > reversedHalf ) {
            reversedHalf  = reversedHalf  * 10 + x % 10;
            x /= 10;
        }

        // return check == x;

        // for the even digits x == reversedHalf  and for odd reversedHalf  / 10 = x;
        return x == reversedHalf  || x == reversedHalf  / 10;

    }
}
public class DEC_22_questleetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test Case 1
        int x1 = 121;
        System.out.println("Test 1 - Input: " + x1);
        System.out.println("Output: " + sol.isPalindrome(x1));
        
        // Test Case 2
        int x2 = -121;
        System.out.println("\nTest 2 - Input: " + x2);
        System.out.println("Output: " + sol.isPalindrome(x2));
        
        // Test Case 3
        int x3 = 10;
        System.out.println("\nTest 3 - Input: " + x3);
        System.out.println("Output: " + sol.isPalindrome(x3));
    }
}