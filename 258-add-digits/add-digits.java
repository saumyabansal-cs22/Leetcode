class Solution {
    public int addDigits(int num) {
        while(num>9){
            int summ=sum(num);
            num=summ;

        }
        return num;
    }
    public static int sum(int n){
        int sum=0;
        int d=0;
        while(n>0){
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
}