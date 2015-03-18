package Geeksforgeeks_Arrays;

import java.util.HashSet;
import java.util.Set;

public class sample 
	{ 
	    static boolean foo(char c) 
	    {
	        System.out.print(c); 
	        return true; 
	    } 
	    public static void main( String[] argv ) 
	    {
	      String name = "mystictc";
	      char[] vowels = new char[] {'a','e','i','o','u'};
	      int count =0;
	      Set<Character> set = new HashSet<Character>();
	      for(char c : name.toCharArray()){
	    	  for(int i=0;i<vowels.length;i++){
	    		  if(c == vowels[i]) {
	    			  count++;
	    			  set.add(c);
	    		  }	  
	    	  }}
	      System.out.println(set.size());
	      if(count>2 || set.size()>1) System.out.println("NO");;
	    } 
	
}
