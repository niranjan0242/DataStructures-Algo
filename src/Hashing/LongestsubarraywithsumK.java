package Hashing;

import java.util.HashMap;

public class LongestsubarraywithsumK {
	
	    public int longestSubarray(int[] nums, int k) {

	        int n=nums.length;
	        int sum=0;
	        int maxLen=0;
	        HashMap<Integer,Integer>presum=new HashMap<>();
	        
	        for(int i=0;i<n;i++){
	            sum=sum+nums[i];
	        if(sum==k){
	            maxLen=Math.max(maxLen,i+1);
	        }
	        int rem = sum-k;

	        if(presum.containsKey(rem)){
	            int len = i-presum.get(rem);
	            maxLen=Math.max(maxLen,len);
	        }

	        if(!presum.containsKey(rem)){

	            presum.put(sum,i);
	        }

	        }
	    return maxLen;

	       
	    }
	
}
