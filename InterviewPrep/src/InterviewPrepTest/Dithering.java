package InterviewPrepTest;

import java.util.HashSet;

// SRM 145 DIV2
public class Dithering {
	/*public static int count(String dithered, String[] screen){
		int count =0;
		for(int len =0;len<screen.length;len++){
		for (int i=0;i<dithered.length();i++){
			for(int j=0;j<screen[len].length();j++){
				if(dithered.charAt(i) ==screen[len].charAt(j)){ //|| screen.contains(dithered)){
					count++;
				}
			}
			System.out.println(count);
		}
		}
		return count;
	}*/
	public static int count(String dithered, String[] screen){
		int count =0;
		HashSet<Character> colors = new HashSet();
		for(char c: dithered.toCharArray()){
			colors.add(c);
		}
		for(String row: screen){
			for(char pixel: row.toCharArray()){
				if(colors.contains(pixel)){
					count++;
				}
			}
		}
		
		
		return count;
	}
	public static void main(String args[]){
		String[] sample = new String[]{"AAAAAAAA","ABWBWBWA",
			 "AWBWBWBA",
			 "ABWBWBWA",
			 "AWBWBWBA",
			 "AAAAAAAA"};
		System.out.println(count("BW",sample));
	}
}
