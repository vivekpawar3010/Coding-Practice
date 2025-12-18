// Q2. Evaluate Reverse Polish Notation
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

// Evaluate the expression. Return an integer that represents the value of the expression.

// Note that:

// The valid operators are '+', '-', '*', and '/'.
// Each operand may be an integer or another expression.
// The division between two integers always truncates toward zero.
// There will not be any division by zero.
// The input represents a valid arithmetic expression in a reverse polish notation.
// The answer and all the intermediate calculations can be represented in a 32-bit integer.
 

// Example 1:

// Input: tokens = ["2","1","+","3","*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9
// Example 2:

// Input: tokens = ["4","13","5","/","+"]
// Output: 6
// Explanation: (4 + (13 / 5)) = 6
// Example 3:

// Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
// Output: 22
// Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
// = ((10 * (6 / (12 * -11))) + 17) + 5
// = ((10 * (6 / -132)) + 17) + 5
// = ((10 * 0) + 17) + 5
// = (0 + 17) + 5
// = 17 + 5
// = 22
 

// Constraints:

// 1 <= tokens.length <= 104
// tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].

import java.util.Stack;
import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st = new Stack<>();
        for(String token:tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*")) {
                int b = st.pop(); 
                int a = st.pop();
                int res = 0;
                if(token.equals("+")) res = a + b;
                else if(token.equals("-")) res = a - b;
                else if(token.equals("/")) res = (int)((double)a / b);
                else res = a * b;

                st.push(res);
            }else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}

public class 17_DEC_questleetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test Case 1
        String[] tokens1 = {"2","1","+","3","*"};
        System.out.println("Test 1 - Input: [\"2\",\"1\",\"+\",\"3\",\"*\"]");
        System.out.println("Output: " + sol.evalRPN(tokens1)); // Output: 9
        
        // Test Case 2
        String[] tokens2 = {"4","13","5","/","+"};
        System.out.println("\nTest 2 - Input: [\"4\",\"13\",\"5\",\"/\",\"+\"]");
        System.out.println("Output: " + sol.evalRPN(tokens2)); // Output: 6
        
        // Test Case 3
        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println("\nTest 3 - Input: [\"10\",\"6\",\"9\",\"3\",\"+\",\"-11\",\"*\",\"/\",\"*\",\"17\",\"+\",\"5\",\"+\"]");
        System.out.println("Output: " + sol.evalRPN(tokens3)); // Output: 22
    }
}
