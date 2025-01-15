package BinarySearch;

import java.util.ArrayList;

public class FindminimuminRotatedSortedArray {
	
	    public int findMin(ArrayList<Integer> arr) {
	        int n=arr.size();
	        int low=0;
	        int high=n-1;
	        int mini=Integer.MAX_VALUE;
	        while(low<=high){
	            int mid =(low + high)/2;
	          
	            if(arr.get(low)<=arr.get(mid)){
	               
	               mini=Math.min(mini,arr.get(low));
	               low=mid+1;

	            }
	            else{
	                mini=Math.min(mini,arr.get(mid));
	                high=mid-1;
	            }
	        }
	      return mini;
	    }
	}


