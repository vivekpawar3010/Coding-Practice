import java.util.*;

public class JUNE_10_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 5;

        char result = sol.kthCharacter(k);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) {
            StringBuilder temp = new StringBuilder(sb);
            for (int i = 0; i < temp.length(); i++) {
                char ch = temp.charAt(i);
                if (ch == 'z') {
                    temp.setCharAt(i, 'a');
                } else {
                    temp.setCharAt(i, (char) (ch + 1));
                }
            }
            sb.append(temp);
        }
        return sb.charAt(k - 1);
    }
}
