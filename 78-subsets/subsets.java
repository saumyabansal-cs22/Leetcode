class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        subsetfunction(nums, 0, ds,list);
        return list;
    }
    public static void subsetfunction(int[] arr, int index, List<Integer> ds, List<List<Integer>> ll){
        
        ll.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++){
            ds.add(arr[i]);
            subsetfunction(arr, i+1, ds, ll);
            ds.remove(ds.size()-1);
        }

    }
}