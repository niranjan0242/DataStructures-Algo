package Arrays;

import java.util.ArrayList;

public class Intersectionoftwosortedarrays {


	    public int[] intersectionArray(int[] arr1, int[] arr2) {
	        int n1=arr1.length;
	        int n2=arr2.length;
	        int i=0;
	        int j=0;
	    
	        ArrayList<Integer>Ilist=new ArrayList<>();

	while(i<n1 && j<n2){

	if(arr1[i]==arr2[j]){
	    Ilist.add(arr1[i]);
	    i++;
	    j++;
	}
	else if(arr1[i]<arr2[j]){
	    i++;
	}
	else if (arr2[j]<arr1[i]){
	    j++;
	}
	}
	int []ans=new int[Ilist.size()];
	for(int k =0;k<Ilist.size();k++){
	    ans[k]=Ilist.get(k);
	}
	return ans;
	        
	    }
	}
