class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        low = 0; high = n - 1
        ans = [-1, -1]
        while (low <= high):
            mid = (low + high)//2
            if target < nums[mid]:
                high = mid - 1
            elif (target > nums[mid]):
                low = mid + 1
            else:
                if (mid == 0 or nums[mid] != nums[mid - 1]):
                    ans[0] = mid
                    break
                else: high = mid - 1
        
        low = 0; high = n - 1
        while (low <= high):
            mid = (low + high)//2
            if (target < nums[mid]):
                high = mid - 1
            elif (target > nums[mid]):
                low = mid + 1
            else:
                if (mid == n - 1 or nums[mid] != nums[mid + 1]):
                    ans[1] = mid
                    break
                else: low = mid + 1

        return ans
                