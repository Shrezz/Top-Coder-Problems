package Geeksforgeeks_Arrays;

import java.util.Arrays;
import java.util.Scanner;
//HackerRank Problem

public class CountingSort1 {
	public static void cs(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the elements");
			ar[i] = in.nextInt();
		}
		int[] count = new int[100];
		for(int i=0;i<n;i++){
			count[ar[i]]++;
		}
		for(int num:count) System.out.print(num+" ");
	}
	public static void main(String args[]){
		cs();
	}
}
