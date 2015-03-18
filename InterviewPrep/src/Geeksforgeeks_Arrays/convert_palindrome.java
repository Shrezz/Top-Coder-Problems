package Geeksforgeeks_Arrays;

import java.util.Scanner;

public class convert_palindrome {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of testcases");
		int num =in.nextInt();
		String[] str = new String[num];
		
		for(int i=0;i<num;i++){
			System.out.println("Enter the strings");
			str[i] = in.next();
		}
		 for(String s: str){
			 int left=0;int right=s.length()-1; int count=0;
			 while(left<right){
				 if(s.charAt(left) != s.charAt(right)){
					 count += Math.abs(s.charAt(right) - s.charAt(left));
					 left++;
					 right--;
				 }
				 
			 }
			 System.out.println(s+"->" + count);
		 }
	}
}
/*pue
heubsbn
feazhaxpux
hmhcy
tmp*/
