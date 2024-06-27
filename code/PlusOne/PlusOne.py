class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        lenArr = len(digits)
        for i in range(lenArr - 1, -1, -1):
            if (digits[i] != 9):
                digits[i] += 1
                return digits
            else:
                digits[i] = 0
        
        result = [0] * (lenArr + 1)
        result[0] = 1
        return result