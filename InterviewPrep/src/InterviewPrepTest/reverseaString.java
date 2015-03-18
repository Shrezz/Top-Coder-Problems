package InterviewPrepTest;

public class reverseaString {

	public static String reverseString(String str){
		char[] set = str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(str.length()-1-i> i){
				char c = set[i];
				set[i] = set[str.length()-1-i];
				set[str.length()-1-i] = c;
		}}
		return String.valueOf(set);
	}
	public static void main(String args[]){
		System.out.println(reverseString("lollypop"));
	}
}
