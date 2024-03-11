class Solution {
    public int majorityElement(int[] nums) {
        return print(nums,nums[0],0);
    }
    public static int print(int[] nums,int a,int b){
        int count=1;
        for(int i=b;i<nums.length;i++){
            if(nums[i]==a)
                count++;
            else
                count--;
            if(count==0)
                return print(nums,nums[i],i);
        }
        return a;
    }
}