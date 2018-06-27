
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
			 if(sum+nums[lo]+nums[hi]==0) {
				 res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
				 
			 }
		 }
	 }
	
	
	return null;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
