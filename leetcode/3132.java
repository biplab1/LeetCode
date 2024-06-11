class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            inner:
            for (int j = i + 1; j < n; j++) {
                int[] temp = new int[nums2.length];
                int index = 0;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    temp[index++] = nums1[k];
                }

                int d = nums2[0] - temp[0];

                for (int k = 0; k < index; k++) {
                    if (nums2[k] - temp[k] != d) continue inner;
                }

                ans = Math.min(ans, d);
            }
        }

        return ans;
    }
}