import java.util.*;

public class SingleNumber {
	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] a = {2,2,1};        
		sn.singleNumber(a);	
	}
 public int singleNumber(int[] nums) {
	 //HashMap<Integer, Integer> hm = new HashMap<>();
	 int a = 0;
	 for(int i = 0;i < nums.length; i++) {
		 System.out.println("The a value first is: " + a);
		 System.out.println("The nums of i value is: " + nums[i]);
		 a = a^nums[i];
		 System.out.println("The nums index is: " + a);
	 }
	// System.out.println("The final result is :" + a);
	 return a;
 }
}
