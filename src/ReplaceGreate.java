import java.util.*;
public class ReplaceGreate {
public static void main(String[] args) {
	
	ReplaceGreate rg = new ReplaceGreate();
	int[] arr = {17,18,5,4,6,1};
	int [] resutl1 = rg.replaceElements(arr);
	for (int i = 0; i < resutl1.length; i++) {
        System.out.print("hi: "+resutl1[i]);
        if (i < resutl1.length - 1)
            System.out.print(", ");
    }
    System.out.println("]");
}


public int[] replaceElements(int[] arr) {
	int n = arr.length;
	System.out.println("Length: " + n);
	int max = -1;
	for(int i = n - 1; i >= 0; i--) {
		int temp = arr[i];
		System.out.println("Tempory: " + temp);
		arr[i] = max;
		System.out.println("Array index: " + arr[i]);
		max = Math.max(max, temp);
		System.out.println("Maxium: " + max);
	}
	return arr;
	
}
}
