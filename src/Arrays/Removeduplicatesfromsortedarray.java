package Arrays;

public class Removeduplicatesfromsortedarray {
	
	    public int removeDuplicates(int[] nums) {
	        int n=nums.length;
	        if (n==0)return 0;
	        int i=0;
	        for(int j=1;j<=n-1;j++){
	            if(nums[j]!=nums[i]){
	                int temp=nums[j];
	                nums[j]=nums[i+1];
	                nums[i+1]=temp;
	               
	               i++;
	            
	            }
	            

	           
	        }
	         return i+1;

	        
	    }
	}

