package Solution;

public class weakestRows {
	public int[] kWeakestRows(int[][] mat, int k) {
        int [][]arr=new int[mat.length][2];
        int []newArr=new int[k];
        int tempNumber=0,a,i,j=0;
        for(i=0;i<mat.length;i++) {
            for(j=0;j<mat[i].length;j++) {
                if(mat[i][j]==1)    
                    tempNumber++;
                else 
                    break;
            }
            arr[i][0]=tempNumber;
            arr[i][1]=i;
            tempNumber=0;
        }
        for(i=0;i<arr.length-1;i++) {
            for(j=0;j<arr.length-1-i;j++) {
                if(arr[j][0]>arr[j+1][0]) {
                    for(a=0;a<2;a++) {
                        tempNumber=arr[j][a];
                        arr[j][a]=arr[j+1][a];
                        arr[j+1][a]=tempNumber;
                    }
                }
            }
        }
        for(i=0;i<k;i++) {
            newArr[i]=arr[i][1];
        }
        return newArr;
    }
}