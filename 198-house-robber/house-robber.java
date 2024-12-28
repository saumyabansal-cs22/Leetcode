class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int[] dp = new int[nums.length];
        if (n==0){
            return 0;
        }
        if (n==1){
            return nums[0];
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        int ch=0,nch=0;
        for(int i=2;i<n;i++){
            ch= nums[i]+dp[i-2];
            nch=dp[i-1];
            dp[i]=Math.max(ch,nch);
        }
        return dp[n-1];
    }
       
}