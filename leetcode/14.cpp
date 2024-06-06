class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        sort(strs.begin(), strs.end());
        int arrlen = strs.size();
        string firststr = strs[0], laststr = strs[arrlen - 1], lcps = "";
        for (int i = 0; i < firststr.size(); i++){
            if (firststr[i] == laststr[i]) lcps += firststr[i];
            else break;
        }
        return lcps; // lcps - longest common prefix string
    }
};

