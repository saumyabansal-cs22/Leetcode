class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
    int[] x=Diagonal(mat);
    return x;
        
    }
    public  static  int[]  Diagonal(int[][] arr){
        int n= arr.length;;
        int m=arr[0].length;
        int[] answer=new int[n*m];
        int p=0;
        for(int i=0;i<n+m-1;i++){
            int r=0,c=0;
            if(i<m){
                c=i;

            }
            else{
                c=m-1;
                r=i-m+1;

            }
            ArrayList<Integer> ll=new ArrayList<>();
            while (r<n&&c>=0){
//                System.out.print(arr[r][c]+" ");
                ll.add(arr[r][c]);
                r++;
                c--;
            }
            if (i%2==0){
                Collections.reverse(ll);
            }
//            System.out.println(ll);
            for(int j=0;j<ll.size();j++){
                answer[p]=ll.get(j);
                p++;
            }

        }
        return answer;

    }
}