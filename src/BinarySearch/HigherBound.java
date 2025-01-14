package BinarySearch;

public class HigherBound {

	    public int upperBound(int[] nums, int x) {
	        int low =0;
	        int n=nums.length;
	        int high=n-1;
	        int ans=n;
	        while(low<=high){
	            int mid=(low + high)/2;
	            if(nums[mid]>x){
	                ans=mid;
	               high=mid-1;

	            }
	            
	            else{
	                 low=mid+1;
	                
	                
	            }
	            
	  
	    }
	    return ans;
	        }
	}



