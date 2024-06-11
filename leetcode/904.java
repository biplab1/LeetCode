class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;

        int i = 0;
        int j = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        

        while(j < n) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            if (map.size() < 2) {
                j++;
            } else if (map.size() == 2) {
                ans = Math.max(ans, j - i + 1);
                j++;
            } else {
                while(map.size() > 2) {
                    int iInt = fruits[i];
                    int iCount = map.get(iInt);

                    map.put(iInt, --iCount);
                    if (iCount == 0) {
                        map.remove(iInt);
                    }
                    i++;
                }
                j++;
            }
        }
        if (map.size() == 1) return n;
        return ans;
    }
}