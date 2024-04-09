import java.util.*;
public class PrintAlternate {
	public static void main(String[] args) {
		PrintAlternate pa = new PrintAlternate();
		int[] nums = {3,1,3,2,4,3};
		System.out.println(pa.minimumOperations(nums));
	}
	 public int minimumOperations(int[] nums) {
		 int len = nums.length;
		int evencost = 0;
		int oddcost = 0;
		for(int i = 0; i<len;i++) {
			if(i % 2 == 0) {
			if(nums[i] % 2 == 0) {
				evencost++;
			}
			else {
				oddcost++;
			}
			}
			else {
				if(nums[i] % 2 == 0) {
					oddcost++;
				}
				else {
					evencost++;
				}
			}
		}
		return Math.min(evencost,oddcost);
}
}