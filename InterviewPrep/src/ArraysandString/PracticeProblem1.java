package ArraysandString;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeProblem1 {

	//Remove duplicates from a String;
	
	public static void remove(String str){
		if(str.length() ==0){
			System.out.println("Empty String");
		}
		Map<Character,Integer> set = new LinkedHashMap<Character, Integer>();
		int count =0;
		for(int i=0;i<str.length();i++){
			if(set.containsKey(str.charAt(i))){
				int value = set.get(str.charAt(i));
				set.put(str.charAt(i), value+1);
			}
			else{
				count =1;
				set.put(str.charAt(i), count);}
		}
		Iterator iterator = set.keySet().iterator();
		while(iterator.hasNext()){
		  Character key   = (Character) iterator.next();
		  //Integer value = 
		  if(set.get(key)>1){
			  System.out.println(key);
		  }}
	}
	
	public static boolean isStringUnique(String str){
		if(str.length()>128){
			return false;
		}
		boolean[] bool = new boolean[128];
		for(int i=0;i<str.length();i++){
			if(bool[str.charAt(i)]){
				return false;
			}
			bool[str.charAt(i)] = true;
		}
		return true;
	}
	public static boolean uniqueChars(String str){
		int checker =0;
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i) - 'a';
			if((checker & (1<<val)) > 0) return false;
			else{
				checker |= (1<<val);
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		//remove("jav");
		if(uniqueChars("jav")){
			System.out.println("String contains unique characters");
		}
		else{
			System.out.println("String has duplicates");
		}
	}
}
