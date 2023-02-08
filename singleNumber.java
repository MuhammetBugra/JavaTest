package Solution;

public class singleNumber {
	 public int singleNumber(int[] nums) {
		 int i,j,a;
		 for(i=0;i<nums.length;i++) {
	            a=0;
	            for(j=0;j<nums.length;j++) {
	                if(j==i)
	                    continue;
	                if(nums[i]==nums[j]) {
	                    a=1;
	                    break;
	                }
	            }
	            if(a==0)
	                break;
	        }
	        return nums[i];
	    }
}
