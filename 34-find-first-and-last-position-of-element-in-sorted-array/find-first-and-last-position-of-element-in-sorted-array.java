class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = new int [2];
        result[0]=searchfirst(nums,target);
        result[1]=searchlast(nums,target);
        return result;
    }
    public static int searchfirst(int [] nums,int target){
        int lo=0;
        int hi=nums.length-1;
        int index=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if (nums[mid]==target){
                index=mid;
                hi=mid-1;
            }
            else if (nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return index;
    }
    public static int searchlast(int []nums,int target){
        int lo=0;
        int hi=nums.length-1;
        int index=-1;
        while(lo<=hi){
             int mid=lo+(hi-lo)/2;
            if (nums[mid]==target){
                index=mid;
                lo=mid+1;
            }
            else if (nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return index;
    }
}