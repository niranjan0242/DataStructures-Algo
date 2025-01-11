package Arrays;

public class MaximumProductSubarrayinanArray {
	
	    public int maxProduct(int[] nums) {
	        int pre=1;
	        int suf=1;
	        int n=nums.length;
	        int maxi=Integer.MIN_VALUE;

	        for(int i=0;i<n;i++){

	            if(pre==0)pre=1;
	            if(suf==0)suf=1;

	            pre=pre*nums[i];
	            suf=suf*nums[n-i-1];
	            maxi=Math.max(maxi,Math.max(pre,suf));
	        }
	        return maxi;
	        
	    }
	

}
