class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        countS = [0] * 26
        countT = [0] * 26

        for i in range(len(s)):
            countS[ord(s[i]) - ord('a')] += 1

        for i in range(len(t)):
            countT[ord(t[i]) - ord('a')] += 1
        
        for i in range(26):
            if countS[i] != countT[i]:
                return False
        
        return True