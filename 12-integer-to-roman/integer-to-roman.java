class Solution {
    public String intToRoman(int num) {
        StringBuilder str= new StringBuilder();
        int[] integers={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        while(num>0){
            while(num>=integers[i]){
                str.append(romans[i]);
                num=num-integers[i];
            }
            i++;
        }
        return str.toString();
    }
}