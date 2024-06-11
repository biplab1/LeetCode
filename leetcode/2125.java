class Solution {
    public int numberOfBeams(String[] bank) {
        int totalBeams = 0;
        int prevDeviceCount = 0;
        
        for (String row : bank) {
            int currDeviceCount = numberOfDevices(row);
            if (currDeviceCount == 0) continue;

            totalBeams += prevDeviceCount * currDeviceCount;
            prevDeviceCount = currDeviceCount;
        }
        
        return totalBeams;
    }

    private int numberOfDevices(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            count += c - '0';
        }

        return count;
    }
}