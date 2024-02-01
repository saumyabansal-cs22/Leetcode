class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> ds= new ArrayList<>();
        partition(s,ds,list);
        return list;
    }

    public  static void partition(String ques,List<String> ds,List<List<String>> ll){
        if (ques.length()==0){
            ll.add(new ArrayList<>(ds));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String s= ques.substring(0,i);
            if (ispalindrome(s)){
            ds.add(s);
            partition(ques.substring(i),ds,ll);
            ds.remove(ds.size()-1);
            }
        }
    }
    public static boolean ispalindrome(String ans){
        int i=0;
        int j=ans.length()-1;
        while (i<j){
            if (ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}