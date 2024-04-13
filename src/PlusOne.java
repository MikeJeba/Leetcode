import java.util.*;
public class PlusOne {
public static void main(String[] args) {
	PlusOne po = new PlusOne();
	int[] digits = {9};
	System.out.println(po.plusOne(digits));
}
public int[] plusOne(int[] digits) {
	int add = 0;
	for(int i = 0; i < digits.length; i++) {
		if(digits[i] == digits.length) {
			add = digits[i] + 1;
			System.out.println(add);
		}
	}
	digits[digits.length-1] = add;
	return digits;
}
}
