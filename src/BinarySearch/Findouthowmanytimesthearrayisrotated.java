package BinarySearch;

import java.util.ArrayList;

public class Findouthowmanytimesthearrayisrotated {
	
	    public int findKRotation(ArrayList<Integer> nums) {
	    int n=nums.size();
	   int low =0;
	   int high =n-1;
	   int index=-1;
	   int mini= Integer.MAX_VALUE;
	   while(low<=high){
	    int mid =(low+high)/2;
	     if(nums.get(low)<=nums.get(high)){
	        if(nums.get(low)<mini){
	        mini=nums.get(low);
	        index=low;
	        }
	       break;

	    }
	    if(nums.get(low)<=nums.get(mid)){
	        if(nums.get(low)<mini){
	        mini=nums.get(low);
	        index=low;
	        }
	        low=mid+1;
	    }
	    else{
	        if(nums.get(mid)<index){
	        mini=nums.get(mid);
	        index=mid;
	        }
	        high=mid-1;

	    }
	   }
	   return index;
	}
	

}
