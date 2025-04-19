class Solution {
    public int maxScore(int[] nums, int k) {
        int l=0;
        int maxsum=0;
        int lsum=0,rsum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            lsum=lsum+nums[i];
            maxsum=lsum;
        }
        int ri=n-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-nums[i];
            rsum=rsum+nums[ri];
            ri--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}