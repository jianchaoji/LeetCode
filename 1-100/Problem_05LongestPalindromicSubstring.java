
public class Problem_05LongestPalindromicSubstring {
	private int location=0,i,j,maxlength=0;
    public String longestPalindrome(String s) {
        int len=s.length();
		if(s.length()<2)
			return s;
for(i=0;i<len-1;i++) {
	ifValuable(s,i,i);
	ifValuable(s,i,i+1);
}
    	
    	return s.substring(location, location+maxlength);
}
    
    private void ifValuable(String s,int begin,int end) {
    	while(begin>=0 && end<s.length()&&s.charAt(begin)==s.charAt(end))
    	{
    		begin--;
    		end++;
    	}
    	if(maxlength<end-begin-1) {
    		maxlength=end-begin-1;
    		location=begin+1;
    	}
    	
    }
}
