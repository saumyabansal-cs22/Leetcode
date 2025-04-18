class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        int a= function(nums,k);
        int b= function(nums,k-1);
        return a-b;
    }
    public int function(int[] nums, int k){
        if (k<0){
            return 0;
        }
        int l=0;
        int r=0;
        int n= nums.length;
        int sum=0, count=0;
        while(r<n){
            sum=sum+nums[r];
            while (sum>k){
                sum=sum-nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}