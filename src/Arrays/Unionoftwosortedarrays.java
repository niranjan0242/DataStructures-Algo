package Arrays;

import java.util.ArrayList;

public class Unionoftwosortedarrays {
	
	    public int[] unionArray(int[] arr1, int[] arr2) {
	        int n1=arr1.length;
	        int n2=arr2.length;
	        int i=0;
	        int j=0;
	        ArrayList<Integer>Ulist=new ArrayList<>();
	        

	        while(i<n1 && j<n2){
	            if(arr1[i]<=arr2[j]){
	                if(Ulist.isEmpty()||Ulist.get(Ulist.size()-1)!=arr1[i]){
	                    Ulist.add(arr1[i]);
	                }
	                i++;
	            }
	            else if(arr2[j]<=arr1[i]){
	                 if(Ulist.isEmpty()||Ulist.get(Ulist.size()-1)!=arr2[j]){
	                    Ulist.add(arr2[j]);
	            }
	            j++;
	        }
	        
	    }
	    while(i<n1){
	        if(Ulist.isEmpty()||Ulist.get(Ulist.size()-1)!=arr1[i]){
	                    Ulist.add(arr1[i]);
	                }
	                i++;
	    }
	    while(j<n2){
	         if(Ulist.isEmpty()||Ulist.get(Ulist.size()-1)!=arr2[j]){
	                    Ulist.add(arr2[j]);
	            }
	            j++;

	    }
	     int[]union=new int[Ulist.size()];
	     for(int k=0;k<Ulist.size();k++){
	        union[k]=Ulist.get(k);
	     }
	     return union;
	}
	}

