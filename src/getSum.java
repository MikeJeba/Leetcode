import java.util.*;

public class getSum {
	public static void main(String[] args) {
	//int a,b;
	getSum gS = new getSum();
	System.out.println(gS.sum(2,3));
	}	
	public int sum(int a,int b) {
	while (b != 0) {
		//System.out.println("Bvalue: " +b);
        int carry = a & b;
        System.out.println("Carry: " +carry);
        a = a ^ b;
        System.out.println("Bvalue: " +b);
        System.out.println("A: " +a);
        b = carry << 1;
        System.out.println("B: " +b);
    }
    return a;
	}
}