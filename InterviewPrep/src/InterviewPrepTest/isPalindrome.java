package InterviewPrepTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class isPalindrome {

	
	

			
	public static boolean checkPalindrome(String str){
		str = str.replace(" ", "").toLowerCase();
		int i=0;
		int j= str.length()-1;
		//str = str.split(" ").toString();
		while(j>i){
			if(str.charAt(i) != str.charAt(j)){
				return false;}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String args[]){
		System.out.println(checkPalindrome("star buttonsnot tub ras"));
		Map<Character,Integer> set=  new HashMap<Character,Integer>();
		String s1 ;
		
	}
	
}
