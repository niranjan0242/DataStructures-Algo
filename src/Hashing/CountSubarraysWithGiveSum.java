package Hashing;

import java.util.HashMap;

public class CountSubarraysWithGiveSum {
	
	    public int subarraySum(int[] nums, int k) {
	        int n=nums.length;
	        int prefixsum=0;
	        int cnt=0;
	        HashMap<Integer,Integer>presum=new HashMap<>();
	        presum.put(0,1);
	        for(int i=0;i<n;i++){
	            prefixsum+=nums[i];

	        int sumToRemove=prefixsum-k;
	        cnt+= presum.getOrDefault(sumToRemove,0);
	        presum.put(prefixsum,presum.getOrDefault(prefixsum,0)+1);
	            
	            }
	            return cnt;
	        }
	    }


