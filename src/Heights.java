import java.util.*;

public class Heights{
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        //System.out.println("Length: " +n);
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
        	var h = heights[i];
        	System.out.println(h);
            while (!stack.isEmpty() && heights[i] > heights[stack.peek()]) {
               var a = result[stack.pop()]++; 
               System.out.println("What is here: "+a);
            }
            if (!stack.isEmpty()) {
               var b = result[stack.peek()]++; 
               System.out.println("I am : " +b);
            }
            var c = stack.push(i);
            System.out.println("Then you: " +c);
        }
        return result;
    }

    public static void main(String[] args) {
        Heights solution = new Heights();
        int[] heights1 = {5,1,2,3,10};
        int[] result1 = solution.canSeePersonsCount(heights1);
        System.out.println("Output for heights1: " + Arrays.toString(result1));
    	
    	    
    	}
    }

