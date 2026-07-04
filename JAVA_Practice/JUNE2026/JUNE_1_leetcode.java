
import java.util.*;

public class JUNE_1_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        List<Integer> result = sol.findDisappearedNumbers(nums);
        System.out.println("Result: " + result);
    }
}

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeared = new ArrayList<>();
        int n = nums.length;
        int check[] = new int[n];
        for (int num : nums) {
            check[(num - 1)] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (check[i] == 0) {
                disappeared.add(i + 1);
            }
        }
        return disappeared;

    }
}
