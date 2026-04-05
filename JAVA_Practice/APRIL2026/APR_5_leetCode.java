// 2160. Minimum Sum of Four Digit Number After Splitting Digits
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.

// For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
// Return the minimum possible sum of new1 and new2.

// Example 1:

// Input: num = 2932
// Output: 52
// Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
// The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
// Example 2:

// Input: num = 4009
// Output: 13
// Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc. 
// The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.

// Constraints:

// 1000 <= num <= 9999
class Solution {

    public int minimumSum(int num) {

        int ct = count(num);

        int[] numArr = arr(num, ct);

        int a = numArr[0] * 10 + numArr[2];
        int b = numArr[1] * 10 + numArr[3];

        return a + b;
    }

    public static int count(int num) {

        if (num < 10)
            return 1;

        return 1 + count(num / 10);
    }

    public static int[] arr(int num, int ct) {

        int[] numArr = new int[ct];

        int i = ct - 1;

        while (num > 0) {
            numArr[i--] = num % 10;
            num /= 10;
        }

        numArr = sort(numArr);

        return numArr;
    }

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}

public class APR_5_leetCode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 2932;
        int result = solution.minimumSum(num);
        System.out.println(result); // Output: 52
    }
}
