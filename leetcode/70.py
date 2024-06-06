class Solution:
    def climbStairs(self, n: int) -> int:
        t = [-1] * (n + 1)
        return self.solve(n, 0, t)

    def solve(self, n: int, start: int, t) -> int:
        if start == n:
            return 1

        if (t[start] != -1):
            return t[start]

        ways = self.solve(n, start + 1, t)

        if (start < n - 1):
            ways += self.solve(n, start + 2, t)
        
        t[start] = ways
        
        return ways
