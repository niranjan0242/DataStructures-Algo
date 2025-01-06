package Sorting;

public class Quicksort {

		   public void qs(int[]nums,int low,int high){
		    if(low<high){
		    int PIndex=qsHelp(nums,low,high);
		    qs(nums,low,PIndex-1);
		    qs(nums,PIndex+1,high);
		    }
		}

		    public int qsHelp(int[]nums,int low,int high){

		   int pivot=nums[low];
		   
		    int i=low;
		    int j=high;
		    while(i<j){
		        while(nums[i]<=pivot && i<=high-1)
		        {
		            i++;
		        }
		        while(nums[j]>pivot && j>=low+1){
		            j--;
		        }

		        if(i<j){
		            int temp = nums[i];
		            nums[i]=nums[j];
		            nums[j]=temp;
		           
		        }
		    }
		        int temp= nums[low];
		     nums[low]=nums[j];
		            nums[j]=temp;
		               return j;
		    }

		     public int[] quickSort(int[] nums) {
		          int n=nums.length;
		      qs(nums,0,n-1);
		      return nums;
		    }

		}




		  


