
public class Problem_11ContainerWithMostWater {
    static public int maxArea(int[] height) {
    	
    	int i=0;
    	int j=height.length-1;
    	int max=0;
    	while(i<j) {
    		
    		int heightI=height[i];
    		int heightJ=height[j];
    		int area=0;
    		if(heightI>=heightJ) {
    			area=(j-i)*heightI;
    			i++;
    		}
    		else {
    			area=(j-i)*heightJ;
    			j--;
    		}
    		
    		max=Math.max(area, max);
    	}
    	
        return max;
        
        
    }
    
    public static void main(String[] arcs) {
    	int[] height={1,1,2};
    	maxArea(height);
    	
    }
}
