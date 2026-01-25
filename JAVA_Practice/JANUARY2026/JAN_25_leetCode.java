// 349. Intersection of Two Arrays
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    
    void addList(ArrayList<Integer> list, int x) {
        if(list.isEmpty() || list.get(list.size() - 1) != x) {
            list.add(x);
        }
    }

    public int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                addList(list, arr1[i]);
                i++;
                j++;
            } else if(arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        int[] result = new int[list.size()];
        for(int k = 0; k < result.length; k++) {
            result[k] = list.get(k);
        }
        
        return result;
    }
}
public class JAN_25_leetCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = sol.intersection(nums1, nums2);
        
        System.out.println(Arrays.toString(result)); // Output could be [4,9] or [9,4]
    }   
}
