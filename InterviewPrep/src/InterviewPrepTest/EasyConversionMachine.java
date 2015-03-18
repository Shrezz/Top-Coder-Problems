package InterviewPrepTest;

import java.util.HashSet;
import java.util.Set;

public class EasyConversionMachine {
	public static String isItPossible(String originalWord, String finalWord, int k){
		int count=0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<k;i++){
			if(finalWord.charAt(i) != originalWord.charAt(i)){
				originalWord.replace(originalWord.charAt(i),finalWord.charAt(i)) ;
				count++;
				continue;
			}}	
		if(count == k) return "POSSIBLE";
		return "IMPOSSIBLE";
		}
}
