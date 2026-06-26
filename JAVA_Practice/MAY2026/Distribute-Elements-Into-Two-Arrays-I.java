1class Solution {
2    public int[] resultArray(int[] nums) {
3        List<Integer> arr1 = new ArrayList<>();
4        List<Integer> arr2 = new ArrayList<>();
5        arr1.add(nums[0]);
6        arr2.add(nums[1]);
7
8        for (int i = 2; i < nums.length; ++i) {
9            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
10                arr1.add(nums[i]);
11            } else {
12                arr2.add(nums[i]);
13            }
14        }
15
16
17        arr1.addAll(arr2);
18
19        int[] arr = new int[arr1.size()];
20        for(int i = 0; i < arr.length; i++){
21            arr[i] = arr1.get(i);
22        }
23
24        return arr;
25    }
26}