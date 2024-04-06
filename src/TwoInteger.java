import java.util.*;
import java.util.Scanner;

public class TwoInteger {
	public static void main(String[] args) {
	    TwoInteger ti = new TwoInteger();
	    Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.nextInt();
	      }
	   int[] result = ti.twoSum(myArray,9);
	   if (result.length == 2) {
           System.out.println("Indices: " + result[0] + ", " + result[1]);
       } else {
           System.out.println("No two elements found with the given target sum.");
       }
	}
	public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}
