// Q1. Can Make Arithmetic Progression From Sequence
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

// Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

 

// Example 1:

// Input: arr = [3,5,1]
// Output: true
// Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
// Example 2:

// Input: arr = [1,2,4]
// Output: false
// Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 

// Constraints:

// 2 <= arr.length <= 1000
// -106 <= arr[i] <= 106
import java.util.Arrays;

 
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // First sort the array to check the difference between numbers
        Arrays.sort(arr);

        // now calculate the diff
        int diff = arr[1] - arr[0];

        //now use the for loop to check the diff 
        for(int i = 2; i < arr.length; i++) {
            if(arr[i] - arr[i -1] != diff){
                return false;
            }
        }
        return true;
    }
}


public class DEC_21_questleetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test Case 1
        int[] arr1 = {3, 5, 1};
        System.out.println("Test 1 - Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + sol.canMakeArithmeticProgression(arr1));
        // Test Case 2
        int[] arr2 = {1, 2, 4};
        System.out.println("\nTest 2 - Input: " + Arrays.toString(arr2));
        System.out.println("Output: " + sol.canMakeArithmeticProgression(arr2));
    }
}
