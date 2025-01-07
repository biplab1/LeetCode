class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sumArr = 0
        for i in range(len(nums)):
            sumArr += nums[i]

        n = len(nums)
        seriesSum = n * (n + 1)//2
        return seriesSum - sumArr
