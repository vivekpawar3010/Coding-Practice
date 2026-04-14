// 412. Fizz Buzz
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given an integer n, return a string array answer (1-indexed) where:

// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.

// Example 1:

// Input: n = 3
// Output: ["1","2","Fizz"]
// Example 2:

// Input: n = 5
// Output: ["1","2","Fizz","4","Buzz"]
// Example 3:

// Input: n = 15
// Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

// Constraints:

// 1 <= n <= 104
import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(itos(i));
        }

        for (int i = 3; i <= n; i += 3) {
            ans.set(i - 1, "Fizz");
        }
        for (int i = 5; i <= n; i += 5) {
            ans.set(i - 1, "Buzz");
        }
        for (int i = 15; i <= n; i += 15) {
            ans.set(i - 1, "FizzBuzz");
        }
        return ans;
    }

    // public List<String> fizzBuzz(int n) {
    // List<String> ans = new ArrayList<>();

    // for(int i = 1; i <= n; i++){
    // if(i % 3 == 0 && i % 5 == 0){
    // ans.add("FizzBuzz");
    // }else if(i % 3 == 0){
    // ans.add("Fizz");
    // }else if(i % 5 == 0){
    // ans.add("Buzz");
    // }else{
    // ans.add(itos(i));
    // }
    // }
    // return ans;
    // }

    public String itos(int i) {
        if (i == 0)
            return "0";

        String res = "";
        while (i > 0) {
            res = (char) ((i % 10) + '0') + res;
            i = i / 10;
        }
        return res;
    }
}

public class APR_13_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        System.out.println(sol.fizzBuzz(n));
        // output: ["1","2","Fizz"]
        n = 5;
        System.out.println(sol.fizzBuzz(n));
        // output: ["1","2","Fizz","4","Buzz"]
        n = 15;
        System.out.println(sol.fizzBuzz(n));

    }
}
