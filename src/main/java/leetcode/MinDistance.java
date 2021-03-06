package leetcode;

public class MinDistance {
    public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
        int minDistanxe = minDistance(word1, word2);
        System.out.println(minDistanxe);
    }

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if(m == 0) return n;
        if(n == 0) return m;
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i <= m; ++i) {
            dp[i][0] = i;
        }
        for(int j = 0; j <= n; ++j) {
            dp[0][j] = j;
        }
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    int num = dp[i - 1][j - 1];
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        return dp[m][n];
    }
}
