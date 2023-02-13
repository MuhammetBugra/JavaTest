package Solution;

import java.util.Arrays;

public class largestElement {
	public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
