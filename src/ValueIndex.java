import java.util.*;
public class ValueIndex {

	public static void main(String[] args) {
		ValueIndex vi = new ValueIndex();
		int[] nums = {4,3,2,1};
		System.out.println(vi.smallestEqual(nums));
	}
public int smallestEqual(int[] nums) {
        int num = nums.length;
        int res = 0;
        for(int i = 0;i < num;i++) {
        	res = i % 10;
        	if(res == nums[i]) {
        		return i;
        	}
        }
        return -1;
    }
}
