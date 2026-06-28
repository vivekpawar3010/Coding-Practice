1class Solution(object):
2    def twoSum(self, nums, target):
3        """
4        :type nums: List[int]
5        :type target: int
6        :rtype: List[int]
7        """
8        for n1 in range(0, len(nums)):
9            for n2 in range(n1 + 1, len(nums)):
10                if(nums[n1] + nums[n2] == target):
11                    return [n1, n2];
12
13        return False;
14        