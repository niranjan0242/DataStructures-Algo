package BinarySearch;

public class SearchInsertPosition {
	
	    public int searchInsert(int[] nums, int target) {
	        int n=nums.length;
	        int low =0;
	        int high=n-1;
	        int ans=n;
	        
	        while(low<=high){
	            int mid=(low + high)/2;
	            if(nums[mid]>=target){
	               ans=mid;
	               high=mid-1;
	            }
	            else if(nums[mid]<target){
	            low=mid+1;
	        }
	      
	    }
	    return ans;
	
	}

}
