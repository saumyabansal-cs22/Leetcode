class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int k=0;
        // int[] arr=new int[len];
        for(int i=0;i<len;i++){
            
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<len){
            nums[k]=0;
            k++;
        }
    }
}