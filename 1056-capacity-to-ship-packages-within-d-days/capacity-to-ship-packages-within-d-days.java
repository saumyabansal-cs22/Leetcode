class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i:weights){
            low=Math.max(low,i);
            high=high+i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int daysreq=daysr(weights,mid);
            if (daysreq<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int daysr(int[] weights, int cap){
        int days=1,load=0;
        for(int i=0;i<weights.length;i++){
            if (weights[i]+load>cap){
                days=days+1;
                load=weights[i];
            }
            else{
                load=load+weights[i];
            }
        }
        return days;
    }
}