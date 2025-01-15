package BinarySearch;

import java.util.ArrayList;

public class SearcInRotatedSortedArray2 {
	
	    public boolean searchInARotatedSortedArrayII(ArrayList<Integer> nums, int k) {
	      int n=nums.size();
	      int low = 0;
	      int high=n-1;
	      while(low<=high){
	        int mid =(low + high)/2;
	        if(nums.get(mid)==k)return true;
	        if(nums.get(low)==nums.get(mid) && nums.get(high)==nums.get(mid)){
	            low++;
	            high--;
	        }
	        else if(nums.get(low)<=nums.get(mid)){
	        if(nums.get(low)<=k && k<=nums.get(mid)){
	            high=mid-1;
	        }
	        else
	        low=mid+1;
	        }
	        else{
	            if(nums.get(mid)<=k && k<=nums.get(high)){
	                low=mid+1;
	            }
	            else
	            high=mid-1;
	        }
	      }
	      return false;
	    }
	

}
