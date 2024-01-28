class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll= new ArrayList<>();
        findCombination(0,candidates,target,ll,new ArrayList<>());
        return ll;

    }
    public static void findCombination(int index,int[] arr, int target, List<List<Integer>> ans, List<Integer> ds ){
        if (index==arr.length){
            if (target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index]<=target){
            ds.add(arr[index]);
            findCombination(index,arr,target-arr[index],ans,new ArrayList<>(ds));
            ds.remove(ds.size()-1);
        }
        findCombination(index+1,arr,target,ans,ds);
    }
}