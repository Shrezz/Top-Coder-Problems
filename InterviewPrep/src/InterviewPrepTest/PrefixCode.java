package InterviewPrepTest;

import java.util.HashSet;

public class PrefixCode {
	
	public static String isOne(String[] words){
		if(words.length==1){
			return "Yes";
		}
		for(int i=0;i<words.length;i++){
			for(int j=i+1;j<words.length;j++){
				if(words[i].startsWith(words[j])){
					return String.valueOf("No")+",  " +String.valueOf(j);
				}
				else{
					if(words[j].startsWith(words[i])){
						return String.valueOf("No")+",  " +String.valueOf(i);
					}
				}
			}
		}
		return "Yes";
	}
	public static String alternativeSolution(String[] words){
		for(int i=0;i<words.length;i++){
			for(int j=0;j<words.length;j++){
				if(i!=j && words[j].startsWith(words[i])){
					return "No, "+i;
				}
			}}
				return "Yes";	
		}
	public static void main(String args[]){
		String[] ar = new String[]{"no", "nosy", "neighbors", "needed"};
		System.out.println(alternativeSolution(ar));
	}

}
