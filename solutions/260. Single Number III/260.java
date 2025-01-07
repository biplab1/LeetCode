/*
Method 1.0: Using xor operator
 */
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        // now xor contains xor of 3 and 5
        // get the rightmost set bit of each num, put num into two separate groups
        int[] result = new int[2];

        int mask = 1;
        while ((xor & mask) == 0) {
            mask <<= 1;
        }

        for (int num : nums) {
            if ((num & mask) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;
    }
}

/*
Method 1.1: Using xor, TC: O(n), SC: O(1)
 */
/*
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int rightMostBit = 1;

        while ((rightMostBit & xor) == 0) {
            rightMostBit <<= 1;
        }

        int num1 = 0;
        int num2 = 0;

        for (int num : nums) {
            if ((rightMostBit & num) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        int[] result = {num1, num2};

        return result;
    }
}
*/
/*
Method 2: Using HashSet
 */

/*
class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num)) set.add(num);
            else set.remove(num);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int s : set) {
            result[index++] = s;
        }

        return result;
    }
}
 */

/*
Method 3: Using HashMap, TC: O(n), SC: O(n)
 */

/*
class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                ans.add(key);
            }
        }
        int[] result = new int[ans.size()];
        int index = 0;

        for (int n : ans) {
            result[index++] = n;
        }
        return result;
    }
}
 */
