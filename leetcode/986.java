class Solution {
    public int[][] intervalIntersection(int[][] first, int[][] second) {
        List<int[]> result = new ArrayList<>();
        if (first.length == 0 || second.length == 0) 
            result.toArray(new int[result.size()][]);
            
        int i = 0, j = 0;

        while (i < first.length && j < second.length) {
            int s1 = first[i][0], e1 = first[i][1]; // start: s, end: e

            int s2 = second[j][0], e2 = second[j][1];

            // check for overlap
            if ((s1 >= s2 && s1 <= e2) || (s2 >= s1 && s2 <= e1)) {
                int s = Math.max(s1, s2);
                int e = Math.min(e1, e2);
                result.add(new int[]{s, e});
            }
            // move whichever ends first
            if (e1 < e2) i++; 
            else j++;
        }

        return result.toArray(new int[result.size()][]);
    }
}

// overlap conditions
/*    [    ]  a
    [     ]   b
 OR
    [     ]    a
       [     ] b
*/