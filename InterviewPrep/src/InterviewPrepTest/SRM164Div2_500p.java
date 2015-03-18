package InterviewPrepTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SRM164Div2_500p {
	
	public static String[]  seating(String[] atendees){
		ArrayList<String> boys = new ArrayList<String>();
		ArrayList<String> girls = new ArrayList<String>();
		
		for(int i=0;i< atendees.length;i++){
			if(atendees[i].contains("girl")) girls.add(atendees[i].split("girl")[0]);
			else boys.add(atendees[i].split("boy")[0]);
		}
		if(!((boys.size() == girls.size()) && (boys.size()%2 ==0))) return new String[]{};
		Collections.sort(boys);
		Collections.sort(girls);
		String[] result = new String[boys.size() + girls.size()+2];
		int phostess = ((atendees.length+2)/2);System.out.println(phostess);
		if((phostess-0)== (atendees.length+2)-phostess && girls.size() == boys.size()){
			result[0] = "HOST";
			int b=0;int g=0;int i=0; boolean t =false;
			for(;i<boys.size();i++){
				if(t) result[i+1] = boys.get(b++);
				else result[i+1] = girls.get(g++);
				t= !t;
			}
			result[i+1] = "HOSTESS";
			t = true;
			i++;
			for(int i1=0;i1<girls.size();i1++){
				if(t) result[i1+i+1] = boys.get(b++);
				else result[i1+i+1] = girls.get(g++);
				t= !t;
			}
		}	
		for(String str: result){
			System.out.println(str);
		}
		return result;
	}
	public static void main(String args[]){
		//String[] ar = new String[]{"BOB boy","SAM girl","DAVE boy","JO girl"};
		//seating(ar);
		       int y = 4;
		       System.out.println(y>>1);   
		       int x = -5;
		       System.out.println(x>>>63); 
		       int inarr1[] = {1, 2, 3};
		       int inarr2[] = {1, 2, 3}; 
		       Object[] arr1 = {inarr1};  // arr1 contains only one element
		       Object[] arr2 = {inarr2};  // arr2 also contains only one element
		       Object[] outarr1 = {arr1}; // outarr1 contains only one element
		       Object[] outarr2 = {arr2}; // outarr2 also contains only one element        
		       if (Arrays.deepEquals(outarr1, outarr2))
		           System.out.println("Same");
		       else
		           System.out.println("Not same");
		       
	}
}
