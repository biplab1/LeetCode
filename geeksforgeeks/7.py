class Solution:
    def reverse(self, x: int) -> int:
        signed = False
        strX = str(x)
        if x < 0:
            signed = True
            strX = strX[1:]
        y = ""
        for i in range(len(strX) - 1, -1, -1):
            y += strX[i]
        if signed:
            y = int('-' + y)
        y = int(y)
        if y < -2**(31) or y > 2**(31) - 1:
            return 0
        else:
            return y