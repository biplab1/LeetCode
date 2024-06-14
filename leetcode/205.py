class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_dict = {}
        t_dict = {}

        for char1, char2 in zip(s, t):
            if char1 not in s_dict and char2 not in t_dict:
                s_dict[char1] = char2
                t_dict[char2] = char1
            if s_dict.get(char1) != char2 or t_dict.get(char2) != char1:
                return False
        return True