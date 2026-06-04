1class Solution {
2    public int minMovesToSeat(int[] seats, int[] students) {
3        int moves = 0;
4        bubbleSort(seats);
5        bubbleSort(students);
6        for(int i = 0; i < seats.length; i++){
7            moves += abs(seats[i] - students[i]);
8        }
9        return moves;
10    }
11    private void bubbleSort(int[] arr){
12        int n = arr.length;
13        for(int i = 0; i < n - 1; i++){
14            for(int j = 0; j < n - i - 1; j++){
15                if (arr[j] > arr[j + 1]) {
16                    int temp = arr[j];
17                    arr[j] = arr[j + 1];
18                    arr[j + 1] = temp;
19                }
20            }
21        }
22    }
23
24    private int abs(int a){
25        return a > 0? a: -a;
26    }
27    
28}