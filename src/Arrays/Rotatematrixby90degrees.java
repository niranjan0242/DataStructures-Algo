package Arrays;

public class Rotatematrixby90degrees {

	    public void rotateMatrix(int[][] matrix) {
	        int n=matrix.length;


	        for(int i=0;i<=n-1;i++){
	            for(int j=0;j<i;j++){
	                int temp=matrix[i][j];
	                matrix[i][j]=matrix[j][i];
	                matrix[j][i]=temp;
	            }
	        }

	        for(int i=0;i<=n-1;i++){
	            for(int j=0;j<n/2;j++){
	                int temp = matrix[i][j];
	            matrix[i][j] = matrix[i][n-1-j];
	            matrix[i][n-1-j] =temp;
	        }
	        
	    }
	}
	}


