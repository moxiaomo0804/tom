package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MaxEnvelopes {
    public static void main(String[] args) {
    }

    public static int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        //Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        Arrays.sort(envelopes, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
            }
        });
        int[] h = new int[n];
        for(int i = 0; i < n; i++) {
            h[i] = envelopes[i][1];
        }
        return lengthOfLIS(h);
    }

    public static int lengthOfLIS(int[] h) {
        if(h == null || h.length == 0) return 0;
        int len = h.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < i; j++) {
                if(h[i] > h[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        int res = 0;
        for(int i = 0; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
