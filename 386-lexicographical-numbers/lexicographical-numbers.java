class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ll =new ArrayList<Integer>();
        counting(0,n,ll);
        int index=0;
        ll.remove(index);
        return ll;
    }
     public static void counting(int curr,int n,List<Integer> list){
       if (curr>n){
           return;
       }
       list.add(curr);
       int i=0;
       if (curr==0){
           i=1;
       }
       for(;i<=9;i++){
           counting(curr*10+i,n,list);
       }
     }
}