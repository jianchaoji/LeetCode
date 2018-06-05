
public class Problem_08StringtoInteger {
  static public int myAtoi(String str) {
	  
	  int i=0;
	  int flat=1;
	  while(i<str.length()&&str.charAt(i)==' ')i++;
	  
	  if(i<str.length()) {
		  if(str.charAt(i)=='-') {
			  i++;
			  flat=-1;
		  }
		  if(str.charAt(i)=='+') {
			  i++;
			  flat=1;
		  }
	  }
	  
	  
	  long num=0;
	  while(i<str.length()) {
		  if(str.charAt(i)<='9'&&str.charAt(i)>='0') {
			  num=num*10+str.charAt(i)-'0';
			  
			  if(num>Integer.MAX_VALUE+1)break;
		  }
		  
		  
		  else 
			  break;
		  i++;
	  }
	  
	  if(flat==1&&num>Integer.MAX_VALUE)return Integer.MAX_VALUE;
	  if(flat==-1&&num>Integer.MAX_VALUE+1)return Integer.MIN_VALUE;
	  
        return (int) (flat*num);
    }
  
   static public void main(String arcs) {
	   String s="    42";
	   int i;
	   i=myAtoi(s);
	   System.out.println(i);
   }
}
