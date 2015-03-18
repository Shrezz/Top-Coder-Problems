package InterviewPrepTest;

import java.util.HashSet;

public class Substitue {
	public static int getValue(String key, String code){
		String result=" ";
		for(int i=0;i<code.length();i++){
			if(key.indexOf(code.charAt(i)) != -1 && code.charAt(i) != key.charAt(key.length()-1)){
				result+= String.valueOf(key.indexOf(code.charAt(i))+1);
			}
			else if (code.charAt(i)==(key.charAt(key.length()-1))&& code.indexOf(key.charAt(key.length()-1)) != -1){
				result+= String.valueOf(0);
			}
		}
		//System.out.println(result.trim());
		return Integer.parseInt(result.trim());
	}
	public static void main(String args[]){
		System.out.println(getValue("CRYSTALBUM","MMA"));
	}
}
