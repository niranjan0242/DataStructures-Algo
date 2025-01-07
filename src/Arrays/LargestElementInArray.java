package Arrays;

public class LargestElementInArray {

	    public int largestElement(int[] nums) {
	    int n =nums.length;
	    int largest=0;
	    for(int i=0;i<=n-1;i++){
	        if(nums[i]>=largest){
	        largest = nums[i];
	        }
	    }
	    return largest;
	    }
	}
