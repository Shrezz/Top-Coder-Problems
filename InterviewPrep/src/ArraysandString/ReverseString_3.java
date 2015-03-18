package ArraysandString;

import java.util.ArrayList;

public class ReverseString_3 {
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
	
	public static ArrayList<String> allStringsI(String s) {
		ArrayList<String> retVal = new ArrayList<String>();
		retVal.add("");

		if (s == null || s.length() == 0) 
		return retVal;
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			ArrayList<String> loop = retVal;
			retVal = new ArrayList<String>();
			for (String st: loop){
				retVal.add(c+st);
				for (int j = 1; j <= st.length(); j++)
					retVal.add(st.substring(0, j) + c + st.substring(j));
				}
		}
		return retVal;
		}
	
	public static void main(String args[]){
		System.out.println(reverseRecursively("hello"));
		
		ArrayList<String> result = allStringsI("abc");
		for(String res: result){
			System.out.println(res);
		}
	}
}
