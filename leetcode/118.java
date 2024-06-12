class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            Integer[] temp = new Integer[i+1];
            Arrays.fill(temp, 1);
            pascal.add(Arrays.asList(temp));
        }

        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < pascal.get(i).size() - 1; j++) {
                pascal.get(i).set(j, pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
            }
        }
        return pascal;
    }
}