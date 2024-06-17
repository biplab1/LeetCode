class Solution {
    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        List<int[]> list = new ArrayList<>();
        
        Arrays.sort(meetings, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        
        list.add(meetings[0]);
        
        for (int i = 1; i < n; i++) {
            int currStart = meetings[i][0];
            int currEnd = meetings[i][1];
            
            int pStart = list.get(list.size() - 1)[0];
            int pEnd = list.get(list.size() - 1)[1];
            
            if (pEnd >= currStart && pEnd <= currEnd) {
                list.remove(list.size() - 1);
                list.add(new int[]{pStart, currEnd});
            } else if (pEnd < currStart) {
                list.add(new int[]{currStart, currEnd});
            } else if (currStart >= pStart && currEnd <= pEnd) { 
                continue;
            }
        }
        
        int sum = 0;
        
        for (int i = 0; i < list.size(); i++) {    
            sum += list.get(i)[1] - list.get(i)[0] + 1;
        }
        
        return days - sum;
    }
}