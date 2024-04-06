import java.util.*;
public class Equilibrium {
public static void main(String[] args) {
	Equilibrium eq = new Equilibrium();
	int[] nums = {1,7,3,6,5,6};
	System.out.println("Output: " + eq.pivotIndex(nums));
}
public int pivotIndex(int[] nums) {
	int total = 0;
	int n = nums.length;
	for(int i = 0;i < n; i++) {
		total += nums[i];
	}
	int left = 0;
	for(int i = 0; i < n; i++) {
		total -= nums[i];
		if(total == left) {
			return i;
		}
		left += nums[i];
	}
    return -1;
}
}
