import java.util.*;

public class Problem_18FourSum {
public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        int len=nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<len-3;i++) {
        	if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)break;//the candidate is too big search finished
        	if(nums[i]+nums[len-3]+nums[len-2]+nums[len-1]<target)continue;//this candidate is too small;
        	if(i>0&&nums[i]==nums[i-1])continue; //prevents the duplicate
        	for(int j=i+1;j<len-2;j++) {
        		if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target) break;//this candidate is too big
        		if(nums[i]+nums[j]+nums[len-2]+nums[len-1]<target)continue;
        		if(j>i+1&&nums[j]==nums[j-1])continue;
        		
        			int low=j+1, high=len-1;
        			while(low<high) {
        				int sum=nums[i]+nums[j]+nums[low]+nums[high];
        				if(target == sum) {
        					result.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
        				    while(low<high&&nums[low]==nums[low+1])low++;
        				    while(low<high&&nums[high-1]==nums[high])high--;
        				    low++;
        				    high--;
        				}
        				else if(sum<target)low++;
        				else high--;
        				
        			
        		}
        	}
        }
        
        
        return result;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
