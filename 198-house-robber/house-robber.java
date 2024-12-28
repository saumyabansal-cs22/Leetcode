class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if (n==0){
            return 0;
        }
        if (n==1){
            return nums[0];
        }
        int prev2=nums[0];
        int prev=Math.max(nums[0],nums[1]);
        int ch=0,nch=0;
        int curr=0;
        for(int i=2;i<n;i++){
            ch= nums[i]+prev2;
            nch=prev;
            prev2=prev;
            curr=Math.max(ch,nch);
            prev=curr;
        }
        return prev;
    }
       
}