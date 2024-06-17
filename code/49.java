
/*
Method 3: using sorting and hashmap
*/

class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();

            Arrays.sort(ch);
            String t = new String(ch);

            if (!map.containsKey(t)) {
                map.put(t, new ArrayList());
            }

            map.get(t).add(s);
        }

        result = new ArrayList(map.values());

        return result;
    }
}

/*
Method 2: Without sort function, 
*/
/*

class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                while(count[i]-- > 0) {
                    sb.append(i + 'a');
                }
            }
            map.computeIfAbsent(sb.toString(), _ -> new ArrayList<>()).add(s);
        }

        result = new ArrayList(map.values());

        return result;
    }
}

*/

/*
Method 1: Brute force
*/

/*

class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        int[][] counts = new int[strs.length][26];

        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                counts[i][c - 'a']++;
            }
        }

        for (int i = 0; i < strs.length; i++) {
            List<String> curr = new ArrayList<>();

            if (strs[i] != "")
                curr.add(strs[i]);
                strs[i] = "";

            for (int j = 0; j < strs.length; j++) {
                if (strs[j] != "" && Arrays.equals(counts[i], counts[j])) {
                    curr.add(strs[j]);
                    strs[j] = "";
                }
            }
            if (curr.size() != 0) 
                result.add(new ArrayList(curr));
        }
        
        return result;
    }
}

*/