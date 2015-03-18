package SortingAlgos;

import java.util.Random;

public class bubblesort {
	static Random generator = new Random();
	
	public static void bubble_sort(int[] ar){
		printArray(ar);
		for(int i =0;i<ar.length-1;i++){
			for(int j=i+1;j<ar.length-1;j++){
				int temp=0;
				if(ar[i]>ar[j]){
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
					}
				}}
		System.out.println();
		printArray(ar);
			}
		
	public static void printArray(int[] ar){
		for(int i=0;i<ar.length-1;i++){
			System.out.print(ar[i]+"--");
		}
	}
	public static void main(String args[]){
		int[] ar = new int[10];
		//Scanner sc = new Scanner(System.in);
		for(int i=0;i<ar.length-1;i++){
			//System.out.println("Enter a number");
			ar[i] = generator.nextInt(10) ;
		}
		bubble_sort(ar);
		
		
	}
}
