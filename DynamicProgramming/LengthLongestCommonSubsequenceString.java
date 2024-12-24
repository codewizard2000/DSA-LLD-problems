package DynamicProgramming;

public class LengthLongestCommonSubsequenceString {
    public static int lcs(String s1,String s2, int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+lcs(s1,s2,m-1,n-1);
        }else{
            return Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
        }
    }
    //tc = O(2^(m+n))
    //sc =  O(m + n)


    public static int lcsdp(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }


    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCAB";
        System.out.println("Length of LCS: " + lcs(s1, s2, s1.length(), s2.length()));
    }
}
