// 11. Container With Most Water

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

 

// Example 1:


// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:

// Input: height = [1,1]
// Output: 1
 

// Constraints:

// n == height.length
// 2 <= n <= 105
// 0 <= height[i] <= 104
 

#include <iostream>
#include <vector>
class Solution {
public:
    int maxArea(vector<int>& height) {
        int waterArea = 0;  // Variable to store the maximum water area
        int left = 0, right = height.size() - 1;  // Two pointers: left at the beginning, right at the end
        
        // Loop until the two pointers meet
        while (left < right) {
            // int h = min(height[left], height[right]);  // Take the minimum height between the two
            // int w = right - left;  // Calculate the width between the two lines
            // waterArea = max(waterArea, h * w);  // Update the maximum water area if the current one is larger
            waterArea = max(waterArea,(right - left) * min(height[left], height[right]));
            
            // Move the pointer with the smaller height
            // if (height[left] < height[right]) {
            //     left++;  // Move left pointer to the right
            // } else {
            //     right--;  // Move right pointer to the left
            // }
            (height[left] < height[right])? left++:right--;
        }
        
        return waterArea;  // Return the maximum water area found
    }
};
int main() {
    Solution sol;
    std::vector<int> height = {1,8,6,2,5,4,8,3,7};
    int result = sol.maxArea(height);
    std::cout << "Maximum water area: " << result << std::endl;  // Output: 49
    return 0;
}