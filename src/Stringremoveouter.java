import java.util.*;
public class Stringremoveouter {
public static void main(String[] args) {
	Stringremoveouter mo = new Stringremoveouter();
	System.out.println(mo.removeOuterParentheses("(())"));

	
}
public String removeOuterParentheses(String s) {
    
        StringBuilder sb = new StringBuilder("");
        int opened = 0;
        for (char c : s.toCharArray()) {
        	
            if ((c == '(' && opened++ > 0) ||   (c == ')' && opened-- > 1)) {
            	sb.append(c);
            }
        }
        return sb.toString();
    }
}
