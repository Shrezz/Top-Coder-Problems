package InterviewPrepTest;

import java.util.HashMap;
import java.util.Map;

public class bubbleSort_Strings {
	
	public static int checkAnagrams(String s1, String s2){
		int count=0;
		for(int i=0;i<s2.length()-1;i++){
			if(!s1.equalsIgnoreCase(s2)){
				System.out.println(s1+" "+s2+" "+s1.equalsIgnoreCase(s2));
				char c = s2.charAt(i);
				Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
			
				s2.replace(s2.charAt(i), s2.charAt(i+1));;
				System.out.println(c);
				s2.replace(s2.charAt(i+1), c);
				System.out.println(s2);
				count++;
			}
			}
		return count;
	}
	public static void main(String args[]){
		System.out.println(checkAnagrams("madam","amdam"));
		
	}
}
