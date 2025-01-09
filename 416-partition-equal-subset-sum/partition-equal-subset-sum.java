class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        boolean ans=false;
        if (sum%2==0){
            Boolean[][] dp = new Boolean[n][sum/2 + 1];
            ans= partitionsum(nums,n-1,sum/2,dp);
        }
        return ans;
    }
    public boolean partitionsum(int[] nums, int index, int target, Boolean[][] dp){
        int n= nums.length;
        if (target==0){
            return true;
        }
         if (index < 0) {             
            return false;         
        } 
        if (dp[index][target]!=null){
            return dp[index][target];
        }
        boolean ntake= partitionsum(nums,index-1,target,dp);
        boolean take=false;
        if (target>=nums[index]){
            take= partitionsum(nums, index-1,target-nums[index],dp);
        }
        return dp[index][target]= take || ntake;
    }
}