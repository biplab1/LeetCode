class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k % n # or if n < k: k = k % n
        temp = nums[-k:] # get the last k elements
        for i in range(n-k-1, -1, -1):   #move all the remaining elements
            nums[i+k] = nums[i]

        for i in range(k):   # add the temp array
            nums[i] = temp[i]




