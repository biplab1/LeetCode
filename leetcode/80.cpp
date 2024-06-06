class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int len = nums.size();
        int p = 0, count = 1, pos = 1;
        for(int i = 1; i < len; i++){
            if(nums[p] != nums[i]){
                count = 1;
                nums[pos] = nums[i];
                p = i;
                pos++;
            }
            else{
                while(count < 2){
                    count++;
                    nums[pos] = nums[i];
                    pos++;
                }
                count++;
            }
        }
        return pos;
    }
};