class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascalRow = new ArrayList<>();
        long res = 1;
        pascalRow.add((int)res);
        for (int col = 1; col < rowIndex + 1; col++) {
            res = res * (rowIndex + 1 - col)/col;
            pascalRow.add((int)res);
        }
        return pascalRow;
    }
}