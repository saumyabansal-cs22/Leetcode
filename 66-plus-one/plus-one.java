class Solution {
    public int[] plusOne(int[] nums) {
        int len=nums.length;
        for(int i=len-1;i>=0;i--){
            if (nums[i]<9){
                nums[i]++;
                return nums;
            }
            else{
                nums[i]=0;
            }
        }
        nums= new int[len+1];
        nums[0]=1;
        return nums;
    }
}