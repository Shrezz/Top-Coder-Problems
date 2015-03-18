package ArraysandString;

import java.util.Scanner;

public class TestArraysandStrings {

	private static void printMatrix(int[][] matrix){
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			}
	}
	public static void main(String args[]){
		/*isSubstring is = new isSubstring();
		System.out.println(is.isRotation(null,null));
		Scanner sc = new Scanner(System.in);
		set0Matrix sm = new set0Matrix();
		int[][] matrix = new int[3][3];
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("Enter the number");
				matrix[i][j] = sc.nextInt();
			}
		}
		printMatrix(matrix);
		sm.setMatrix(matrix);
		System.out.println();
		printMatrix(matrix);
		compressString cs = new compressString();
		StringBuffer str = new StringBuffer("aaabbcaa");
		System.out.println(cs.compress(str));*/
		replacespaces rs = new replacespaces();
		rs.removespace("Mr John Smith    ",13);
		
		}
	}

