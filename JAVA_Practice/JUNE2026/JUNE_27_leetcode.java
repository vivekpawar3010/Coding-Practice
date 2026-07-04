import java.util.*;

public class JUNE_27_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] target = { 1, 2, 3 };
        int[] arr = { 1, 3, 2 };

        boolean result = sol.canBeEqual(target, arr);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length)
            return false;
        int[] check = new int[1001];
        for (int n : target) {
            check[n]++;
        }
        for (int n : arr) {
            if (check[n] == 0)
                return false;
            check[n]--;
        }
        return true;
    }
}
// class Solution {
// public boolean canBeEqual(int[] target, int[] arr) {
// if(target.length != arr.length) return false;
// int n = target.length;
// for(int i = 0; i < n; i++){
// for(int j = 0; j < n; j++){
// if(target[i] == arr[j]){
// arr[j] = 0;
// target[i] = 0;
// break;
// }
// }
// }
// for(int i = 0; i < n; i++){
// if(target[i] != 0 || arr[i] != 0){
// return false;
// }
// }
// return true;
// }
// }
