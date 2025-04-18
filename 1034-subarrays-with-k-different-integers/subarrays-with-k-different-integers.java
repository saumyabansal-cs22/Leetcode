class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int a= function(nums,k);
        int b= function(nums,k-1);
        return a-b;
    }
    public int function(int[] nums, int k){
        int l=0;
        int r=0;
        int count=0;
        HashMap<Integer,Integer> mpp= new HashMap<>();
        while(r<nums.length){
            mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
            while(mpp.size()>k){
                mpp.put(nums[l], mpp.get(nums[l]) - 1);
                if (mpp.get(nums[l])==0){
                    mpp.remove(nums[l]);
                }
                l++;
            }   
            count+=r-l+1;
            r++;
        }
        return count;
    }
}