package BinarySearch;

public class SquareRootOfANumber {

	    public long floorSqrt(long n) {
	        long low=1;
	        long high=n;
	        long ans=1;
	        if(n==0){
	            return 0;
	        }
	        while(low<=high){
	            long mid=(low+high)/2;
	            if(mid*mid<=n){
	                ans=mid;
	                low=mid+1;
	            }
	            else{
	                high=mid-1;
	            }
	        }
	        return ans;
	      
	    }
	
}
