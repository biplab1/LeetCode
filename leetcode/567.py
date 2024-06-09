class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        
        s1_one_zero = [0]*26
        s2_one_zero = [0]*26
        
        for i in range(len(s1)):
            s1_one_zero[ord(s1[i]) - 97] += 1
            s2_one_zero[ord(s2[i]) - 97] += 1
            
        if s1_one_zero == s2_one_zero:
            return True
        
        for i in range(len(s1), len(s2)):
            s2_one_zero[ord(s2[i]) - 97] += 1
            s2_one_zero[ord(s2[i - len(s1)]) - 97] -= 1
            
            if s1_one_zero == s2_one_zero:
                return True
        
        return False