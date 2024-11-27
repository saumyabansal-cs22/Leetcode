class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int ans=0,p=1,si=0,ei=0;
        while(ei<arr.length){
            //grow
            p=p*arr[ei];
            //shrink
            while(p>=k && si<=ei){
                p=p/arr[si];
                si++;
            }
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;        
    }

}