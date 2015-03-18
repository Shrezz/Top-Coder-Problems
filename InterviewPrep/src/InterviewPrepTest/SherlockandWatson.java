package InterviewPrepTest;

import java.util.Scanner;

public class SherlockandWatson {
// Right Circular Rotation.
		public static void printSolution(){
		int[] input = new int[3];
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter the number of elements,rotations and queries; separated by ' '");
		String s = in.nextLine();
		input[0] = Integer.parseInt(s.split(" ")[0]);
		input[1] = Integer.parseInt(s.split(" ")[1]);
		input[2] = Integer.parseInt(s.split(" ")[2]);
		int[] elements = new int[input[0]];
		//System.out.println("Enter the elements of the array");
		String str = in.nextLine();
		for(int i=0;i<elements.length;i++){
			elements[i] = Integer.parseInt(str.split(" ")[i]);
		}
		int[] output = new int[input[2]];
		for(int i=0;i<output.length;i++){
			//System.out.println("Enter the index of query");
			output[i] = in.nextInt(); 
		}
		for(int i=0;i<input[1];i++){
			elements = shift(elements);
		}
		for(int i=0;i<output.length;i++){
			System.out.println(elements[output[i]]);
		}
		
		}
		public static int[] shift(int[] elements){
			int last = elements[elements.length-1];
			for(int i=elements.length-1;i>=1;i--){
				elements[i] = elements[i-1];
			}
			elements[0] = last;
			return elements;
		}
		
		public static void main(String args[]){
			printSolution();
		}
		
}
		
