/*
Method 1: Without Map
 */
class Solution {
    public int majorityElement(int[] nums) {
       int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}

/*
Method 2: Using Map
 */
/*

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }

        return 0;
    }
}
*/
