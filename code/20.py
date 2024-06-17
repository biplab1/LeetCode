class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) == 1:
            return False
        stack = []
        brackets = {')': '(', ']': '[', '}': '{'}
        
        for i in range(len(s)):
            if s[i] == '(' or s[i] == '[' or s[i] == '{':
                stack.append(s[i])
            if s[i] == ')' or s[i] == ']' or s[i] == '}':
                if stack == []:
                    return False
                elif stack[-1] == brackets[s[i]]:
                    stack.pop()
                else:
                    return False
       
        if stack == []:
            return True
        else:
            return False