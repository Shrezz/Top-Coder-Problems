package Geeksforgeeks_Arrays;

import java.util.ArrayList;

public class fibonacci {
	public static void fib(){
		int[] ar = new int[15];
	//	ArrayList<Integer> ar = new ArrayList<Integer>();
		ar[0]=0;;
		ar[1]=1;;	
		for(int i=2;i<ar.length;i++){
			ar[i] = ar[i-1]+ar[i-2];
			System.out.println(ar[i]);
		}
	}
	public static void main(String args[]){
		fib();
	}
}
