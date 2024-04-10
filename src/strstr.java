import java.util.*;
public class strstr {
	public static void main(String[] args) {
		strstr st = new strstr();
		st.strStr("sadbutsad","sad");
	}
	public int strStr(String haystack, String needle) {
		System.out.println(needle.indexOf(needle));
        return haystack.indexOf(needle);
    }
}
