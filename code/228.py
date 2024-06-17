class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if not nums:
            return []

        arr = []
        start = end = nums[0]

        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1] + 1:
                end = nums[i]
            else:
                if start == end:
                    arr.append(str(start))
                else:
                    arr.append(f"{start}->{end}")
                start = end = nums[i]

        if start == end:
            arr.append(str(start))
        else:
            arr.append(f"{start}->{end}")

        return arr

