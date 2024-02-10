class Solution {
    public List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=i+1;
        }
        combi(arr,k,list,ds,0);
        return list;
    }
    // public static void combi(int[] arr, int k, List<List<Integer>> ll, List<Integer> ds){
    //     if (ds.size()==k){
    //         ll.add(new ArrayList<>(ds));
    //         return;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         if (ds.contains(arr[i])){
    //             continue;
    //         }
    //         ds.add(arr[i]);
    //         combi(arr,k,ll,ds);
    //         ds.remove(ds.size()-1);
    //     }
    public static void combi(int[] arr, int k, List<List<Integer>> ll, List<Integer> ds, int start) {
    if (ds.size() == k) {
        ll.add(new ArrayList<>(ds));
        return;
    }
    for (int i = start; i < arr.length; i++) {
        ds.add(arr[i]);
        combi(arr, k, ll, ds, i + 1); // Pass i + 1 as the start index for the next iteration
        ds.remove(ds.size() - 1);
    }
}

}


