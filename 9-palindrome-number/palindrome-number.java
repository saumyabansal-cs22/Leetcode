class Solution {
    public boolean isPalindrome(int num) {
	    int sum=0;
	    int d=0;
	    int copy=num;
	    while(num>0){
	        d=num%10;
	        sum=sum*10+d;
	        num=num/10;
	    }
	    if (sum==copy){
	        return true;
	    }
	    return false;   
    }
    
}