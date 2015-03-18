package InterviewPrepTest;

//import java.util.ArrayList;
import java.util.Arrays;

public class anagram {
	 public String palindrome(String str) { 
	        StringBuilder result = new StringBuilder(str); 
	        if (str != null && str.length() > 0) { 
	            int l = str.length() - 1; 
	            int s = 0; 
	            int e = l; 
	            while ( e > s) { 
	                if (str.charAt(s) == str.charAt(e)) { 
	                    ++s; --e; 
	                } else { 
	                    s -= (l - e - 1); 
	                    e = l; 
	                } 
	            } 
	            StringBuilder start = new StringBuilder(str.substring(0, s - (l - e))); 
	            result.append(start.reverse()); 
	        } 
	        return result.toString(); 
	    } 
	

	public static void main(String args[]){
		//System.out.println(isAnagram("hello","olle"));
		//System.out.println(palindrome());
		}
	}

