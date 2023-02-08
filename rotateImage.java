package Solution;

public class rotateImage {
	public void rotate(int[][] matrix) {
		int i,j,temp;
        for(i=0;i<matrix.length;i++) {
            for(j=0;j<matrix.length-i;j++) {
                temp=matrix[i][j];
                matrix[i][j]=matrix[matrix.length-j-1][matrix.length-i-1];
                matrix[matrix.length-j-1][matrix.length-i-1]=temp;
            }
        }
        for(i=0;i<matrix.length/2;i++) {
            for(j=0;j<matrix.length;j++) {
                temp=matrix[i][j];
                matrix[i][j]=matrix[matrix.length-i-1][j];
                matrix[matrix.length-i-1][j]=temp;
            }
        }
    }
}
