package BinarySearch;

public class firstAndLastOccuance {
		    private int lowerBound(int[] nums, int target) {
	        int n=nums.length;
	        int low=0;
	        int high=n-1;
	        int ans=n;
	        while(low<=high){
	           int mid=(low+high)/2;
	            if(nums[mid]>=target){
	                ans=mid;
	                high=mid-1;
	            }
	            else{
	                low=mid+1;
	            }
	        }
	        return ans;
	    }
	     private int upperBound(int[] nums, int target) {
	        int n=nums.length;
	        int low=0;
	        int high=n-1;
	        int ans=n;
	        while(low<=high){
	           int mid=(low+high)/2;
	            if(nums[mid]>target){
	                ans=mid;
	                high=mid-1;
	            }
	            else{
	                low=mid+1;
	            }
	        }
	        return ans;
	    }
	    public int[]searchRange(int[]nums,int target){
	        int n=nums.length;
	        int firstocc=lowerBound(nums,target);
	        if(firstocc==n||nums[firstocc]!=target)return new int[]{-1,-1};
	        int secondocc=upperBound(nums,target) -1;
	       // if(secondocc==n||secondocc!=target)return new int[]{-1,-1}
	       return new int[]{firstocc,secondocc};
	           }
	}



