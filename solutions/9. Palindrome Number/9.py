# Method 1:
class Solution:
    def isPalindrome(self, x: int) -> bool:
        return str(x) == str(x)[::-1]
    

# Method 2:
# class Solution:
#     def isPalindrome(self, x: int) -> bool:
#         temp = 0
#         rev = 0
#         y = x
#         while (x != 0):
#             pop = x % 10
#             x = int(x / 10) 
#             temp = temp * 10 + pop
#             rev = temp
#         if rev < -2**(31) or rev > 2**(31) - 1:
#                 return 0
#         return y == rev

# Method 3:
