class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        right = len(s) - 1
        result = 0

        for i in range(len(g) - 1, -1, -1):
            if right >= 0 and g[i] <= s[right]:
                result += 1
                right -= 1
        
        return result