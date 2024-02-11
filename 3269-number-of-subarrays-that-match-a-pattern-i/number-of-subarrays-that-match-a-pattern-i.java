class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count=0;
        for(int i=0;i<nums.length-pattern.length;i++){
            boolean f=true;
            for(int j=0;j<pattern.length;j++){
                if (pattern[j]==0 && nums[i+j+1]!=nums[i+j]){
                    f=false;
                    break;
                }
                if (pattern[j]==1&& nums[i+j+1]<=nums[i+j]){
                    f=false;
                    break;
                }
                if (pattern[j]==-1 && nums[i+j+1]>=nums[i+j]){
                    f=false;
                    break;
                }
            
        }
        if (f){
            count++;
        }
    }
    return count;
}
}