class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int[] arr2={-1,-1};
        int[] arr=new int[2];
        if (len==0){
            return arr2;
        }
        for(int i=0;i<len;i++){
            if (nums[i]==target){
                arr[0]=i;
                break;
            }
            else
            arr[0]=-1;
        }
        for(int i=len-1;i>=0;i--){
            if (nums[i]==target){
                arr[1]=i;
                break;
            }
            else{
                arr[1]=-1;
            }
        }
        return arr;

    }
}