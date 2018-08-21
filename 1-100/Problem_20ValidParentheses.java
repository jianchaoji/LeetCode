
import java.util.*;

public class Problem_20ValidParentheses {
	 public boolean isValid(String s) {
	     Stack<Character> str=new Stack<Character>();
         char[] ss=s.toCharArray();
	     for(char c:ss) {
	    	 if(c=='(') {
	    		 str.push(')');
	    	 }
	    	 else  if(c=='[') {
	    		 str.push(']');
	    	 }
	    	 else if(c=='{') {
	    		 str.push('}');
	    	 }
	    	 else if (str.isEmpty()||c!=str.pop()){
	    		 return false; 
	    	 }
	     }
	     
	     
	     return str.isEmpty();
		 
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
