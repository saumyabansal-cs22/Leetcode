class Solution {
    public int[] singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        int mask=ans&(~(ans-1));
        int a=0;
        for(int i=0;i<nums.length;i++){
            if ((nums[i]&mask)!=0){
                a=a^nums[i];
            }
        }
        int b= ans^a;
        return new int[]{a,b};

    }
}