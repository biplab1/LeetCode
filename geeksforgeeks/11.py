class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == 2:
            return min(height[0], height[1]) * (1 - 0)
        i = 0
        j = len(height) - 1
        area = 0
        while i < j:
            width = j - i
            depth = min(height[i], height[j])
            maxarea = max(width * depth, area)
            area = maxarea
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return area