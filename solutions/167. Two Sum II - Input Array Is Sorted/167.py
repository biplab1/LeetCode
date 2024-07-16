# Method 1.0:
class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        n = len(numbers)
        i = 0
        j = n - 1
        while i < j:
            if numbers[i] + numbers[j] == target:
                return [i+1, j+1]
            elif numbers[i] + numbers[j] > target:
                j -= 1
            else:
                i += 1
        return None

# Method 1.1:

# class Solution:
#     def twoSum(self, numbers: List[int], target: int) -> List[int]:
#
#         n = len(numbers)
#         i = 0
#         j = n - 1
#         while i < j:
#             if numbers[i] + numbers[j] == target:
#                 index1 = i
#                 index2 = j
#                 break
#             elif numbers[i] + numbers[j] > target:
#                 j -= 1
#             else:
#                 i += 1
#         return [index1+1, index2+1]
