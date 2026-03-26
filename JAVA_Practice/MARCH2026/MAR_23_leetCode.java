
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(boxes.charAt(j) == '1'){
                    result[i] += Math.abs(i - j);
                }
            }
        }
        return result;
    }
}
public class MAR_23_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // inputs
        String boxes = "110";
        int[] result = sol.minOperations(boxes);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
