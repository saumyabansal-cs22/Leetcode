class Solution{
public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> ds= new ArrayList<>();
    function(list, ds, nums);
    return list;
}

public static void function(List<List<Integer>> list, List<Integer> ds, int[] nums) {
    if (nums.length==ds.size()){
        list.add(new ArrayList<>(ds));
        return;
    }
    for (int i = 0; i < nums.length; i++) {
        if (ds.contains(nums[i])) continue;
        ds.add(nums[i]);
        function(list, ds, nums);
        ds.remove(ds.size() - 1);  //start nhi lena
    }
}
}