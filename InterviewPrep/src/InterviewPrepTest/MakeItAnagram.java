package InterviewPrepTest;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MakeItAnagram {

	    public static void main(String[] args) {
	        Map<Character,Integer> hm1 = new HashMap<Character,Integer>();
	        Map<Character,Integer> hm2 = new HashMap<Character,Integer>();
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the first string");
	        String s1 = in.nextLine();
	        System.out.println("Enter the second string");
	        String s2 = in.nextLine();
	        int count =0;
	        for(int i=0;i<s1.length();i++){
	            if(hm1.containsKey(s1.charAt(i))){
	                int value = hm1.get(s1.charAt(i));
	                hm1.put(s1.charAt(i),value+1);
	            }
	            else{
	                hm1.put(s1.charAt(i),1);
	            }
	        }
	       
	        for(int i=0;i<s2.length();i++){
	            if(hm1.containsKey(s2.charAt(i))){
	                int value = hm1.get(s2.charAt(i));
	                hm1.put(s2.charAt(i),value-1);
	            }
	            else if(hm2.containsKey(s2.charAt(i))){
	            	int value = hm2.get(s2.charAt(i));
	            	hm2.put(s2.charAt(i),value+1);
	            }
	            else{
	                hm2.put(s2.charAt(i),1);
	            }
	        }
	        for(int num: hm1.values()){
	           if(num>0) count+=num;
	        }
	        for(int num : hm2.values()){
	        	if(num>0) count+= num;
	        }
	        System.out.println(count);
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    }
	}
