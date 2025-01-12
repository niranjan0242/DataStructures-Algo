package Hashing;

import java.util.Arrays;

public class LongestConsecutiveSequenceinanArray {
	
	    public int longestConsecutive(int[] nums) {
	        int n=nums.length;
	        int longest=1;
	        int cnt=0;
	        int lastsmall=Integer.MIN_VALUE;

	        Arrays.sort(nums);

	        for(int i=0;i<n;i++){
	        if(nums[i]-1==lastsmall){
	            cnt++;
	            lastsmall=nums[i];
	        }
	        if(nums[i]!=lastsmall){
	            cnt=1;
	            lastsmall=nums[i];
	        }

	         longest=Math.max(cnt,longest);
	        }
	         

	        return longest;
	    }
	

}
