class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapMag = new HashMap<>();
        Map<Character, Integer> mapRan = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            mapMag.put(c, mapMag.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            mapRan.put(c, mapRan.getOrDefault(c, 0) + 1);
        }

        for (Character c : mapRan.keySet()) {
            if (!mapMag.containsKey(c)){
                return false;
            } else {
                if (mapRan.get(c) > mapMag.get(c)) {
                    return false;
                }
            }
        }

        return true;
    }
}