import java.util.*;

public class JULY_9_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] seats = { 3, 1, 5 };
        int[] students = { 2, 7, 4 };

        int result = sol.minMovesToSeat(seats, students);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        bubbleSort(seats);
        bubbleSort(students);
        for (int i = 0; i < seats.length; i++) {
            moves += abs(seats[i] - students[i]);
        }
        return moves;
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private int abs(int a) {
        return a > 0 ? a : -a;
    }
}