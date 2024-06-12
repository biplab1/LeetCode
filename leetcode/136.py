class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        visited = {}
        
        for i in range(len(nums)):
            if nums[i] in visited:
                visited[nums[i]] += 1
            else:
                visited[nums[i]] = 1
                
        return (list(visited.keys())[list(visited.values()).index(1)])