1class Solution {
2public:
3    int maxArea(vector<int>& height) {
4        int waterArea = 0;  // Variable to store the maximum water area
5        int left = 0, right = height.size() - 1;  // Two pointers: left at the beginning, right at the end
6        
7        // Loop until the two pointers meet
8        while (left < right) {
9            // int h = min(height[left], height[right]);  // Take the minimum height between the two
10            // int w = right - left;  // Calculate the width between the two lines
11            // waterArea = max(waterArea, h * w);  // Update the maximum water area if the current one is larger
12            waterArea = max(waterArea,(right - left) * min(height[left], height[right]));
13            
14            // Move the pointer with the smaller height
15            // if (height[left] < height[right]) {
16            //     left++;  // Move left pointer to the right
17            // } else {
18            //     right--;  // Move right pointer to the left
19            // }
20            (height[left] < height[right])? left++:right--;
21        }
22        
23        return waterArea;  // Return the maximum water area found
24    }
25};
26