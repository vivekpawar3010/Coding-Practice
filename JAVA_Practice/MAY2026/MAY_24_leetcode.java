public class MAY_24_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3, 4 };

        int[] result = sol.resultArray(nums);
        System.out.println("Result: " + java.util.Arrays.toString(result));
    }
}

class Solution {
    public int[] resultArray(int[] nums) {
        java.util.List<Integer> arr1 = new java.util.ArrayList<>();
        java.util.List<Integer> arr2 = new java.util.ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; ++i) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        arr1.addAll(arr2);

        int[] arr = new int[arr1.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1.get(i);
        }

        return arr;
    }
}