package Arrays;

public class LinearSearch {
	
	    public int linearSearch(int nums[], int target) {
			
	    int n=nums.length;
	     for(int i=0;i<=n-1;i++){
	      if(nums[i]==target){
	        return i;
	      }
	      
	     
	     }

	     return -1;
	    }
	}

