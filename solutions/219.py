class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        hashMap = {}
        for i in range(len(nums)):
            if nums[i] in hashMap:
                if (i - hashMap[nums[i]] <= k):
                    return True
            hashMap[nums[i]] = i
        return False