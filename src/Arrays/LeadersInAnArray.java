package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {

	class Solution {
	    public ArrayList<Integer> leaders(int[]arr ) {
	        int n =arr.length;

	         ArrayList<Integer>lead=new ArrayList<>();
	         if(n==0)return lead;

	          int maxi= arr[n-1];
	          lead.add(maxi);

	        for(int i=n-1;i>=0;i--){
	            if(arr[i]>maxi){
	                lead.add(arr[i]);
	            }
	            maxi=Math.max(maxi,arr[i]);
	        }
	        Collections.reverse(lead);
	        return lead;
	        
	    }
	}
}



