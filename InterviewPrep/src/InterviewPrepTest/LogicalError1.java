package InterviewPrepTest;
import java.util.*; 
public class LogicalError1 {
	
	     public static void main(String[] args)
	     {
	         int n = 10;   
	         //countdown(n); 
	         countdown2(n); 
	     }

	     public static void countdown(int num)
	     {
	         while(num >= 0)
	         {
	             System.out.println(num); 
	             num--;
	         }; 
	     }

	     public static void countdown2(int number)
	     {
	    	 
	         for(int i = number; i >= 0; i--)
	         {
	             System.out.println(i);
	         }      
	     }
	 }

