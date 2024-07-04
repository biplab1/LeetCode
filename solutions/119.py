class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        pascal_row = []
        res = 1
        pascal_row.append(res)
        for col in range(1, rowIndex + 1):
            res = res * (rowIndex + 1 - col) // col
            pascal_row.append(res)
        return pascal_row