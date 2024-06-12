class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        pascal = []
        for row in range(1, numRows + 1):
            temp = []
            res = 1
            temp.append(res)
            for col in range(1, row):
                res = res * (row - col) // col
                temp.append(res)
            pascal.append(temp)

        return pascal