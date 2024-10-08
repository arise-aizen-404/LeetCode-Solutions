class Solution {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
        int n = s.size();
        unordered_set<string> sset(wordDict.begin(), wordDict.end());
        vector<bool> dp(n + 1, false);
        dp[0] = true;
        for (int i = 1; i <= n; ++i) {
            // for (int j=0; j<i; ++j) { // takes time
            for (int j = i-1; j >= 0; --j) { // efficitent
                if (dp[j] && sset.find(s.substr(j, i - j)) != sset.end()) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
};
