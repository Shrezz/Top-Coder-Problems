package InterviewPrepTest;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	
	public static boolean isAnagram(String s1, String s2){
	    
		if(s1 == null || s2 ==null) return false;
	    if(s1.length()!= s2.length()) return false;
	    Map<Character,Integer> hm = new HashMap<Character,Integer>();
	    
	    for(int i=0;i<s1.length();i++){  
	        char c = s1.charAt(i);
	        if(hm.containsKey(c)) {
	            int value = hm.get(c);
	            hm.put(c,value+1);
	        }
	        else{
	            hm.put(c,1);
	        }  
	    }

	    for(int i=0;i<s2.length();i++){
	         char c = s2.charAt(i);
	         if(hm.containsKey(c)) {
	            int value = hm.get(c);
	            hm.put(c,value-1);
	         }
	         else{
	             return false;
	         }
	    }
	    
	    for(Integer value: hm.values()){
	        if(value >0) return false;    
	        }
	        
	    return true;

	}
	
	public static void main(String args[]){
		System.out.println(isAnagram(""," "));
	}
}
