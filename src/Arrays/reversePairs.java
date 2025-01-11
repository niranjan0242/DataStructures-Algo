package Arrays;

import java.util.ArrayList;

public class reversePairs {
	
	    public int reversepairs(int[] nums) {
	        int n=nums.length;
	        return team(nums,n);
	        
	    }

	private void merge(int []arr,int low,int mid ,int high){
	    ArrayList<Integer>temp=new ArrayList<>();
	    int left=low;
	    int right=mid+1;

	    while(left<=mid && right<=high){
	        if(arr[left]<=arr[right]){
	            temp.add(arr[left]);
	            left++;
	        }
	        else{
	            temp.add(arr[right]);
	            right++;
	        }
	       
	       
	    }
	    

	     while(left<=mid){
	           temp.add(arr[left]);
	            left++;
	        }
	     while(right<=high){
	             temp.add(arr[right]);
	            right++;
	        }
	         for(int i=low;i<=high;i++){
	            arr[i]=temp.get(i-low);
	        }
	}
	        private int countpairs(int[]arr,int low,int mid,int high){
	            int right=mid+1;
	            int cnt=0;
	            for(int i=low;i<=mid;i++){
	                while(right<=high && arr[i]>2*arr[right]){
	                    right++;
	                   
	                }
	                 cnt=cnt+(right-(mid+1));
	            }
	            return cnt;
	        }
	     
	     public int mergesort(int []arr,int low,int high){
	        int cnt=0;
	        if(low>=high){
	            return cnt;
	        }
	        int mid =low + (high-low)/2;
	        
	        cnt=cnt+mergesort(arr,low,mid);
	        cnt=cnt+mergesort(arr,mid+1,high);
	        cnt+=countpairs(arr,low,mid,high);
	        merge(arr,low,mid,high);
	        return cnt;

	             }
	             public int team(int[]skill,int n){
	                return mergesort(skill,0,n-1);
	             }
	        
	    }
	 


