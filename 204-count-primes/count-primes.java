class Solution {
      public static int countPrimes(int  n){
        if (n<=2){
            return 0;
        }
        boolean[] prime= new boolean[n];
        int l= prime.length;
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i*i<=l;i++){
            if (prime[i]==false){
                for(int j=2;i*j<l;j++){
                    prime[i*j]=true;
                }
            }
        }
        int count=0;
        for(int i=2;i<l;i++){
            if (prime[i]==false){
                count++;

            }

        }
        return count;
    }
}