package Geeksforgeeks_Arrays;

import java.util.HashSet;
import java.util.Set;

public class Test_Arrays {
	public static void main(String args[]){
		/*findsum fs = new findsum();
		find_closest_pair fc = new find_closest_pair();
		fc.find_pair(ar,54);
		odd_no_occurrences on = new odd_no_occurrences();
		System.out.println(on.find_odd(ar));
		System.out.println(on.find_bits(12, 16));
		char[] ar = new char[] {'A','A','A','C','C','B','B','C','C','C','B','C','C'};;
		majorityElement me = new majorityElement();
		System.out.println(me.findMajorityEle(ar));*/
		
		int[] arr = new int[]{1,2,3};
		reverseArray ra = new reverseArray();
		ra.recurse_reverse(arr, 0, arr.length-1);
		//for(int n:ar) System.out.println(n+"-->");
		String str = "003.";
		System.out.println(str.substring(str.indexOf(".")).length()>0);
		double frac = (str.substring(str.indexOf(".")).length()>1)? Double.parseDouble(str.substring(str.indexOf("."))):0.0 ;
		System.out.println(frac);
		Set<String> s = new HashSet<String>();
		int sum=0;
		
	}
}
