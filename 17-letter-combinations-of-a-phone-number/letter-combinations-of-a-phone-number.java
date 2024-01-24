class Solution {
    static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll= new ArrayList<>();
        if (digits.length()==0){
            return ll;
        }
        keypad(digits,"",ll);
        return ll;

    }
    public static void keypad(String ques, String ans,List<String> ll){
        if (ques.length()==0){
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);//2
        String press=map[ch-'0'];//abc
        for(int i=0;i<press.length();i++){
            keypad(ques.substring(1),ans+press.charAt(i),ll);
        }
    }
}