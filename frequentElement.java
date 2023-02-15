package Solution;

import java.util.Arrays;

public class frequentElement {
	public static int[] topKFrequent(int[] nums, int k) {
        int []answer=new int[k];
        int [][]temp=new int[nums.length][2];
        int i,j,number,m=-1,a;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i=j) {
        	number=0;
        	m++;
        	temp[m][0]=nums[i];
        	for(j=i;j<nums.length;j++) {
        		if(nums[i]!=nums[j]) 
        			break;
        		temp[m][1]=++number;
        	}
        }
        for(i=0;i<nums.length-1;i++) {
            for(j=0;j<nums.length-1-i;j++) {
                if(temp[j][1]<temp[j+1][1]) {
                    for(a=0;a<2;a++) {
                        number=temp[j][a];
                        temp[j][a]=temp[j+1][a];
                        temp[j+1][a]=number;
                    }
                }
            }
        }
        for(i=0;i<k;i++) {
			answer[i]=temp[i][0];
		}
        return answer;
    }
	public static void main(String[] args) {
		int []nums= {4,1,-1,2,-1,2,3};
		int []arr=topKFrequent(nums,2);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
