package InterviewPrepTest;

import java.util.ArrayList;

public class SRM149div2 {
	public static String amount(int dollars, int cents){
	        int n=0;
	        int j=1;
	        String s = "";
	        String sDollars = String.valueOf(dollars);
	        String sCents = String.valueOf(cents);	        
	        for(int i=sDollars.length()-1; i>=0; i--){
	            s += sDollars.charAt(i);
	            if(j%3==0 && j !=sDollars.length() ) {
	                s+=",";
	            }
	            j++;
	        }
	        StringBuffer ans = new StringBuffer(s);
	        if(sCents.length() != 2) {
	            sCents = "0" + sCents;
	        }
	        return "$"+ans.reverse()+"."+sCents;

	    }

	public static void main(String args[]){
		System.out.println(amount(1000,1));
	}
}
