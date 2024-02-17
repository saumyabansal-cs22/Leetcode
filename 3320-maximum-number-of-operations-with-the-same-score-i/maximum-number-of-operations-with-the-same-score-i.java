class Solution {
    public int maxOperations(int[] nums) {
        int k=0;
        int len=nums.length;
        int[] sumarr=new int[len];
        // int sum=0;
        int count=0;
        for(int i=0;i<nums.length-1;i=i+2){
               int sum=nums[i]+nums[i+1];
               sumarr[k]=sum;
               k=k+1;
        }
        for(int i=0;i<=k;i++){
            if (sumarr[i]==sumarr[i+1]){
                count++;
            }
            else{
                break;
            }
        }
        return count+1;
    }
}