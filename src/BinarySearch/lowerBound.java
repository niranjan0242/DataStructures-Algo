package BinarySearch;

public class lowerBound {

	    public int lowerbound(int[] nums, int x) {
	        int n=nums.length;
	        int low=0;
	        int high=n-1;
	        int ans=n;
	        while(low<=high){
	            int mid=(low+high)/2;
	            if(nums[mid]>=x){
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


