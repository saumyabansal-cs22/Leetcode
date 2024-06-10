class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if (i>count){
                return false;
            }
            count=Math.max(count,nums[i]+i);
        }
        return true;
    }
}