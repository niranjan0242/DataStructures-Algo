package Arrays;

public class LeftRotateArraybyOne {

	    public void rotateArrayByOne(int[] arr) {
	        int n =arr.length;
	        int temp=arr[0];
	        for(int i=1;i<=n-1;i++){
	            
	            arr[i-1]=arr[i];
	          
	        }
	     arr[n-1]=temp;
	        
	    }
	
}
