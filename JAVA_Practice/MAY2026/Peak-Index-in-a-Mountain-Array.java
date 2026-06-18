1class Solution {
2public:
3    int peakIndexInMountainArray(vector<int>& arr) {
4        int i = 1, j = arr.size() - 2;
5    
6        while(i <= j){
7            int mid = i + (j - i) / 2;
8            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
9                return mid;
10            }else if(arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]){
11                i = mid + 1;
12            }else {
13                j = mid - 1;
14            }
15        }
16        return -1;
17    }
18};