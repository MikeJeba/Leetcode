import java.util.*;
public class strstr {
	public static void main(String[] args) {
		strstr st = new strstr();
		st.strStr("sadbutsad","sad");
	}
	public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
