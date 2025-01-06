package Sorting;

public class MergeSort {


		public void merge(int[]arr,int low ,int mid,int high){
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

		public void mergeSortHelper(int[]arr,int low,int high){
		    int mid =(low + high)/2;
		    if(low==high)return;
		    mergeSortHelper(arr,low,mid);
		    mergeSortHelper(arr,mid+1,high);
		    merge(arr,low,mid,high);
		}
		    public int[] mergeSort(int[] nums) {
		   int n=nums.length;

		    mergeSortHelper(nums,0,n-1);
		     
		 return nums;
		    }
		  
}


