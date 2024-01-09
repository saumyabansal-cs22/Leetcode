class Solution {
    public int reverse(int n) {
        int sum=0;
        while(n!=0){
            int d=n%10;
            if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10){
                return 0;
            }
            sum=sum*10+d;
            n=n/10;
        }
        return sum;
    }
}