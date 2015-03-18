package InterviewPrepTest;

import java.util.Scanner;

public class uneaten_Leaves {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total number of leaves");
		int n = in.nextInt();
		System.out.println("Enter the number of caterpillars");
		int k = in.nextInt();
		int[] input = new int[k];
		for(int i=0;i<input.length;i++){
			System.out.println("Enter the jump");
			input[i] = in.nextInt();
		}
		int count =0;
		for(int i=1;i<=n;i++){
			for(int j=0;j<input.length;j++){
				if(i%input[j]==0) {
					count++;
					break;
				}
				else {
					continue;	
				}
			}
		}
		System.out.println(n-count);
	}
}
