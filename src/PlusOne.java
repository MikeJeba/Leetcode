import java.util.*;
public class PlusOne {
public static void main(String[] args) {
	PlusOne po = new PlusOne();
	int[] digits = {1,2,3};
	po.plusOne(digits);
}
public int[] plusOne(int[] digits) {
	int add = 0;
	for(int i = 0; i < digits.length; i++) {
		if(digits[i] == digits.length) {
			add = digits[i] + 1;
			System.out.println(add);
		}
		if(digits[digits.length - 1] != add) {
			int replace = add;
			System.out.println(replace);
		}
	}
	return digits;
}
}
