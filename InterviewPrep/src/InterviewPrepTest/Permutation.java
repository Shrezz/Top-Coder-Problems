package InterviewPrepTest;

import java.util.Stack;

public class Permutation {

	public static void permute(String sofar, String str){
		if(str.isEmpty()){
			System.out.println(sofar);
		}
		for(int i=0;i<str.length();i++){
			permute(sofar+str.charAt(i),str.substring(0,i)+str.substring(i+1));
		}
	}
	public static void permute(int sofar,int num){
	
	}
	public static void main(String args[]){
		permute("","abba");
		Stack<Integer> newest = new Stack<Integer>();
	}
}
