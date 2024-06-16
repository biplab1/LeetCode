class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        currCnt = 0
        maxCnt = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                maxCnt = max(maxCnt, currCnt)
                currCnt = 0
            else:
                currCnt += 1

        return max(maxCnt, currCnt)
