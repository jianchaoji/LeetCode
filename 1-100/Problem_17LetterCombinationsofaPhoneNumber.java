import java.util.*;

public class Problem_17LetterCombinationsofaPhoneNumber {
	 public List<String> letterCombinations(String digits) {
	        List<String> result=new ArrayList<String>();
	        
	        String digitsLetter[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	        
	        if(digits.length()==0)return result;
	        
	        result.add("");
	        
	        for(int i=0;i<digits.length();i++) {
	        	result=combine(digitsLetter[digits.charAt(i)-'0'],result);
	        }
	        
	        return result;
	    }
	 
	 public static List<String> combine(String digit, List<String> r){
		 List<String> result= new ArrayList<String>();
		 
		 for(int i=0;i<digit.length();i++) {
			 for(String x:r) {
				 result.add(x+digit.charAt(i));
			 }
		 }
		 
		 return result;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
