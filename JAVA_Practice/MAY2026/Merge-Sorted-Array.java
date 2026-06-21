1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int midx = m - 1;
4        int nidx = n - 1;
5        int right = m + n - 1;
6
7        while (nidx >= 0) {
8            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
9                nums1[right] = nums1[midx];
10                midx--;
11            } else {
12                nums1[right] = nums2[nidx];
13                nidx--;
14            }
15            right--;
16        }   
17    }
18}