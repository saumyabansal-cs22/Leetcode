class Solution {
    public int minOperations(int k) {
      int ans=Integer.MAX_VALUE;
      int x=1;
        int sum=1;
        int ops=0;
        while(true){
            int temp=ops;
            temp+=k/x;
            if (k%x!=0){
                temp+=1;
            }
            if (temp>ans)
                break;
        ans=Math.min(ans,temp);
        x++;
        ops++;
        }
        return ans-1;
    }
}