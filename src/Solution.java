import java.util.*;
	class Solution {
		public static void main(String[] args) {
	  Solution solution = new Solution();
	  int[] nums = new int[3];
	  int[] expectedNums = new int[3];
	  nums[0] = 1;
	  nums[1] = 1;
	  nums[2] = 2;
	  int k = solution.removeDuplicates(nums);
	  assert k == expectedNums.length;
	  for (int i = 0; i < k; i++) {
	      assert nums[i] == expectedNums[i];
	  }
}
		  public int removeDuplicates(int[] nums) {
		         int i=0;
		        for(int j=1;j<nums.length;j++){
		            if(nums[i]!=nums[j]){
		                i++;
		                System.out.println("The index value: " + i);
		                nums[i]=nums[j];
		                System.out.println("The value is " + nums[i]);
		            }
		        }
		        return i+1;
		    }
		}