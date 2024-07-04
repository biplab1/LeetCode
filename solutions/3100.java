class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = 0;

        while (numExchange <= numBottles) {
            numBottles -= numExchange;
            ans += numExchange;
            numExchange++;
            numBottles++;
        }
        
        ans += numBottles;
        return ans;
    }
}
