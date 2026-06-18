1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int i = 1, j = arr.length - 2;
4    
5        while(i <= j){
6            int mid = i + (j - i) / 2;
7            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
8                return mid;
9            }else if(arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]){
10                i = mid + 1;
11            }else {
12                j = mid - 1;
13            }
14        }
15        return -1;
16    }
17}