class Solution {

public:
    int dp[2001][2001];

    int helper(string &s, int i,int j){
        if(i >= j || isPalindrome(s,i,j)){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int mn = INT_MAX; 

        for(int k = i; k<=j; k++){
            if (isPalindrome(s,i,k)){
                mn = min(mn,1+helper(s,k+1,j));
            }
        }

        return dp[i][j] = mn;
    }

    bool isPalindrome(string &s,int i , int j){
        while(i <= j){
            if (s[i] != s[j]){
                return false;
            }
            j--;
            i++;
        }

        return true;
    }

    
    int minCut(string s) {
        memset(dp,-1, sizeof(dp));
        return helper(s,0,s.length()-1);
    }

};