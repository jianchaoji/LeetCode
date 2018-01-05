
public class Problem_09PalindromeNumber {
	 public boolean isPalindrome(int x) {
	        int reserve,i=1,x1=x;
			double newNumber=0;
	       if(x==0)return true;
			if(x<0||x%10==0)return false;
	        while(x>0){
	            reserve=x%10;
	            x=x/10;
	            newNumber=newNumber*10;
	            newNumber+=reserve;
	            i++;
	        }
	        if(newNumber>Integer.MAX_VALUE||newNumber<Integer.MIN_VALUE)
				return false;
	        
	        return (x1==newNumber);
	    }
}
