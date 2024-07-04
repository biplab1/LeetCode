class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 0) {
                for (int i = groupSize - 1; i >= 0; i--) {
                    if (map.getOrDefault(key + i, 0) < map.get(key)) return false;
                    map.put(key + i, map.get(key + i) - map.get(key));
                }
            }
        }

        return true;
        
    }
}
