class Solution {
    public boolean circularArrayLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            int slow = i;
            int fast = i;

            int direction = (int) Math.signum(nums[i]);

            do {
                slow = nextDir(nums, direction, slow);

                fast = nextDir(nums, direction, fast);
                
                if (fast != -1) {
                    fast = nextDir(nums, direction, fast);
                }

            } while (slow != -1 && fast != -1 && slow != fast);

            if (slow != -1 && slow == fast) {
                return true;
            }
        }

        return false;
    }

    private int nextDir(int[] nums, int direction, int pos) {
        int currDir = (int) Math.signum(nums[pos]);

        if (currDir * direction < 0) {
            return -1;
        }
        int n = nums.length;

        int nextIdx = (pos + nums[pos]) % n;

        if (nextIdx < 0) nextIdx += n;

        return nextIdx == pos ? -1 : nextIdx;
    }
}