import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		MissingNumber mn = new MissingNumber();
		int[] nums = {1,2};
		System.out.println("Excepted output: " + missing(nums));
}
	public static int missing(int[] nums) {
		int n = nums.length;
		int eS = n * (n + 1)/2;
		int aS = 0;
		for(int num: nums) {
			aS += num;
			System.out.println("" + aS);
		}
		return eS - aS;
	}
}