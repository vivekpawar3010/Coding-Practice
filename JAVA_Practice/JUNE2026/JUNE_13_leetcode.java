import java.util.*;

public class JUNE_13_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        int[][] result = sol.flipAndInvertImage(image);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1] ^ 1;
                image[i][n - j - 1] = temp ^ 1;
            }
        }
        return image;
    }
}
