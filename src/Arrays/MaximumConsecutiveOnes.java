package Arrays;

public class MaximumConsecutiveOnes {
	
	    public int findMaxConsecutiveOnes(int[] nums) {
	        int n=nums.length;
	        int cnt=0;
	        int maxi=0;
	        for(int i=0;i<=n-1;i++){
	            if(nums[i]==1){
	                cnt++;
	                maxi=Math.max(maxi,cnt);
	            }
	            else
	            cnt=0;
	          
	        }
	    
	            return maxi;
	    }
	
}
