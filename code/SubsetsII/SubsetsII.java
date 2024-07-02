/*
 * Method 1.0:
 */
class Solution {
    Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        for (int num : nums) {
            input.add(num);
        }
        
        solve(input, output);
        List<List<Integer>> out = new ArrayList<>(result);
        
        return out;
    }
        
    private void solve(List<Integer> input, List<Integer> output) {
        if (input.isEmpty()) {
            Collections.sort(output);
            result.add(output);
            return;
        }
        
        List<Integer> output1 = new ArrayList<>(output);
        List<Integer> output2 = new ArrayList<>(output);
        
        output2.add(input.get(0));
        input.remove(0);
        
        List<Integer> input1 = new ArrayList<>(input);
        List<Integer> input2 = new ArrayList<>(input);
        
        solve(input1, output1);
        solve(input2, output2);
    }
}

/*
  * Method 1.1:
  */
  /*
   * class Solution {
    Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        for (int num : nums) {
            input.add(num);
        }
        
        solve(input, output);
        List<List<Integer>> out = new ArrayList<>(result);
        Collections.sort(out, new LexicographicComparator());
        
        return out;
    }
        
    private void solve(List<Integer> input, List<Integer> output) {
        if (input.isEmpty()) {
            Collections.sort(output);
            result.add(output);
            return;
        }
        
        List<Integer> output1 = new ArrayList<>(output);
        List<Integer> output2 = new ArrayList<>(output);
        
        output2.add(input.get(0));
        input.remove(0);
        
        List<Integer> input1 = new ArrayList<>(input);
        List<Integer> input2 = new ArrayList<>(input);
        
        solve(input1, output1);
        solve(input2, output2);
    }
    
    class LexicographicComparator implements Comparator<List<Integer>> {
        @Override
        public int compare(List<Integer> list1, List<Integer> list2) {
            int size = Math.min(list1.size(), list2.size());
            for (int i = 0; i < size; i++) {
                int cmp = list1.get(i).compareTo(list2.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(list1.size(), list2.size());
        }
    }
}
   */

/*
 * Method 2:
 */
/*
 * class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, Set<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        current.remove(current.size() - 1);
        generateSubsets(nums, index + 1, current, result);
    }
}
 */

 