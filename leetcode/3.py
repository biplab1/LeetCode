class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        visited = {} # initialize a dict
        start = 0
        maxlen_substring = 0
        
        for end in range(len(s)):
            if s[end] in visited:
                start = max(start, visited[s[end]] + 1) 
                
            visited[s[end]] = end
            maxlen_substring = max(maxlen_substring, end - start + 1)
        
        return maxlen_substring