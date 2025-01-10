package Arrays;

public class MajorityElement_1 {
	
	    public int majorityElement(int[] nums) {

	        int n=nums.length;
	        int ele=0;
	        int cnt=0;

	        for(int i=0;i<n;i++){
	            if(cnt==0){
	            
	            ele=nums[i];
	            cnt=1;
	            }
	            else if(ele==nums[i]){
	                cnt++;
	            }
	            else if(ele!=nums[i]){
	                cnt--;
	            }
	        }

	        int cnt1=0;
	        for(int j=0;j<n;j++){
	            if(nums[j]==ele){
	                cnt1++;
	            }

	        }
	          if(cnt1>n/2) {
	         return ele;
	          }
	          else{
	          return -1;
	          }
	    }
	}


