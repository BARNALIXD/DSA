class Solution {
    public int editDistance(String S, String T) {
        int N = S.length();
        int M = T.length();
        
        int dp[][] = new int[N + 1][M + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return count(N, M, S, T, dp);
    }

    int count(int n, int m, String S, String T, int dp[][]) {
        if (n == 0) return m;
        if (m == 0) return n;

        if (dp[n][m] != -1) return dp[n][m];

        if (S.charAt(n - 1) == T.charAt(m - 1)) {
            return dp[n][m] = count(n - 1, m - 1, S, T, dp);
        }

        int insert = 1 + count(n, m - 1, S, T, dp);
        int del = 1 + count(n - 1, m, S, T, dp);
        int replace = 1 + count(n - 1, m - 1, S, T, dp);

        return dp[n][m] = Math.min(insert, Math.min(del, replace));
    }
}
