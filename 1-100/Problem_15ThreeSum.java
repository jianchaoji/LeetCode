
import java.util.*;

public class Problem_15ThreeSum {
	 public List<List<Integer>> threeSum(int[] nums) {
			Arrays.sort(nums);
			 List<List<Integer>> res= new LinkedList<>();
			 for(int i=0;i<nums.length-2;i++) {	     
              
               int lo=i+1;
				 int hi=nums.length-1;
				 int sum=0-nums[i];
           
				 if(i==0||(i>0&&nums[i]!=nums[i-1])) {                    
             
		            while(lo<hi){
					 if(nums[lo]+nums[hi]==sum) {
						 res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
						 while(lo<hi&&nums[lo]==nums[lo+1])lo++;
						 while(lo<hi&&nums[hi]==nums[hi-1])hi--;
						 lo++;hi--;
					 }else if(nums[lo]+nums[hi]<sum)lo++;
					 else hi--;
				   }
			    }
		     }			
			return res;    
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
