package ArraysandString;
//One solution is to maintain HashMap, insert all character counts of Str1 into it. subtract counts while iterating through Str2
public class PracticeProblem2 {
	public static boolean isAnagram(String str1,String str2){
		if(str1.length()!= str2.length()){
			return false;
		}
		//Assuming that there are only 128 characters in the string
		int[] chars = new int[128];
		for(int i=0;i<str1.length();i++){
			chars[str1.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++){
			chars[str2.charAt(i)]--;
			if(chars[str2.charAt(i)]<0){
				return false;
			}
		}
		return true;
	}
	
	//Permutations of a string:
	
	public static void permute(String sofar, String str){
		if(str.isEmpty()){
			System.out.println(sofar);
		}
		for(int i=0;i<str.length();i++){
			permute(sofar+str.charAt(i), str.substring(0, i)+str.substring(i+1));
		}
		//for(int i=0;i<str.length();i++){
		//permute(sofar+str.charAt(i),str.substring(0,i)+str.substring(i+1));
	}
	public static void main(String args[]){
		if(isAnagram("mary","armi")){
			System.out.println("Yes");
		}
		else System.out.println("No");
		permute("","abc");
		}
		
	}

