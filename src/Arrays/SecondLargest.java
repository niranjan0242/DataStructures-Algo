package Arrays;

public class SecondLargest {
	
	    public int secondLargestElement(int[] arr) {
	    int n= arr.length;
	    int largest=arr[0];
	    int secondLargest=-1;
	    for(int i=0;i<=n-1;i++){
	        if(arr[i]>largest ){
	            secondLargest=largest;
	            largest=arr[i];
	        }
	        else if(arr[i]>secondLargest && arr[i]<largest){
	            secondLargest=arr[i];
	        }
	    }
	    return secondLargest;
	    }
}
	  
	
