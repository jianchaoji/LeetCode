
import java.util.*;

public class Problem_16ThreeSumCloset {
	 public int threeSumClosest(int[] nums, int target) {
		 
		 Arrays.sort(nums);
		 int result=nums[0]+nums[1]+nums[nums.length-1]-target;
		 for(int i=0;i<nums.length-2;i++) {
			 int lo=i+1;
			 int hi=nums.length-1;
			 while(lo<hi) {
			 int sum=nums[i]+nums[lo]+nums[hi];
			 int temp;
			 temp=sum-target;
			 if(result>0) {
				 hi--;
			     }else {
				 lo++;
			            }
				 if(Math.abs(temp)<Math.abs(result)) {
					 result=temp;
				 }
			 }
		 }
		 
		 
	        return result;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
