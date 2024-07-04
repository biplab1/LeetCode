class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        solve(k - 1, 0, list);
        return list.get(0);
    }

    private void solve(int k, int index, List<Integer> list) {
        if (list.size() == 1) {
            return;
        }

        index = (index + k) % list.size();
        list.remove(index);

        solve(k, index, list);
    }
}