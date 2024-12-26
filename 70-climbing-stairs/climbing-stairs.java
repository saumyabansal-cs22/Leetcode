// Approach - 1
class Solution {
    public int climbStairs(int n) {
        // memoization 
        // int[] dp= new int[n+1];
        // Arrays.fill(dp, -1);
        // if (n<=1){
        //     return 1;
        // }
        // if (dp[n]!=-1){
        //     return dp[n];
        // }
        // dp[n]=climbStairs(n-1)+climbStairs(n-2);
        // return dp[n];

         //tabulation 
        int[] dp= new int[n+1];
        dp[0]=1;
        if (n>0){

        dp[1]=1;
        }
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}