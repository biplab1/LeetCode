class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lastNonZeroFoundAt = 0
        current = 0
        while current < len(nums):
            if nums[current] != 0:
                nums[lastNonZeroFoundAt], nums[current] = nums[current], nums[lastNonZeroFoundAt] 
                lastNonZeroFoundAt += 1
            current+=1
            