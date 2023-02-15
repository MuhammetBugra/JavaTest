package Solution;

import java.util.ArrayList;
import java.util.List;

public class productArray {
	public static int[] productExceptSelf(int[] nums) {
        int []answer=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        int product=1,i;
        for(i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                list.add(i);
            	continue;
            }
            else
            	product*=nums[i];
        }
        if(list.isEmpty()) {
        	for(i=0;i<nums.length;i++)
                answer[i]=product/nums[i];
        }
        else if(list.size()>1)
        	return answer;
        else {
        	for(i=0;i<list.size();i++)
                answer[list.get(i)]=product;
        }
        return answer;
    }
	public static void main(String[] args) {
		int []nums= {1,2,3,4};
		int []arr=productExceptSelf(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
