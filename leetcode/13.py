class Solution:
    def romanToInt(self, s: str) -> int:
        symbolDict = {'I' : 1, 'V' : 5, 'X' : 10, 'L' : 50, 
                      'C' : 100, 'D' : 500, 'M' : 1000}
        romantoInt = 0
        i = 0
        if len(s) < 2:
            return symbolDict[s]
        while i < len(s):
            if i != 0:
                if s[i] == "V" and s[i - 1] == "I":
                    romantoInt = romantoInt - symbolDict[s[i-1]] +  4
                    i += 1
                    continue
                if s[i] == "X" and s[i - 1]  == "I":
                    romantoInt = romantoInt - symbolDict[s[i-1]] +  9
                    i += 1
                    continue
                if s[i] == "L" and s[i - 1]  == "X":
                    romantoInt = romantoInt - symbolDict[s[i-1]] +  40
                    i += 1
                    continue
                if s[i] == "C" and s[i - 1]  == "X":
                    romantoInt = romantoInt - symbolDict[s[i-1]] +  90
                    i += 1
                    continue
                if s[i] == "D" and s[i - 1]  == "C":
                    romantoInt = romantoInt - symbolDict[s[i-1]] +  400
                    i += 1
                    continue
                if s[i] == "M" and s[i - 1]  == "C":
                    romantoInt = romantoInt - symbolDict[s[i-1]] +  900
                    i += 1
                    continue
                
            romantoInt += symbolDict[s[i]]
            i += 1
            
        return romantoInt
        