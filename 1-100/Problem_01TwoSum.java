
public class Problem_01TwoSum {
	public  int[] twoSum(int[] nums, int target)
    {
    	int[] a=new int[2];
    	 int b;
    	 int c;
   
     for (b=0;b<nums.length;b++)
     {
    	 for(c=b+1;c<nums.length;c++)
    	 {
    		 if(target==nums[b]+nums[c])
    		 {
    			a[0]=b;
    			a[1]=c;
    			return a;
    		 }
    	 }
     }
    return a;
    }
}
