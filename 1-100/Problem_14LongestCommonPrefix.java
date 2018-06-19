
public class Problem_14LongestCommonPrefix {
public String longestCommonPrefix(String[] strs) {
	if(strs==null||strs.length==0) return "";
	String s=strs[0];
   
    int min=strs[0].length();
    int times=strs.length;
    String prefix="";
	
    
    
	
		for(int i=0;i<min;i++) {
			for(int j=0;j<times;j++) {
			if (min>strs[j].length()) {
					min=strs[j].length();
					if(min==0) {
						return prefix;
					}
			}
			if(s.charAt(i)!=strs[j].charAt(i)) {
				return prefix;
			}
		
		}
			prefix+=s.charAt(i);
		
	}
	return prefix;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
