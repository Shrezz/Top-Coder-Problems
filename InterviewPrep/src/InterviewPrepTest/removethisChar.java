package InterviewPrepTest;

public class removethisChar {
	public static String remove(String str, char remove){
		
		str=str.replaceAll(String.valueOf(remove), "");
		return str;
	}
	public static void main(String args[]){
		System.out.println(remove("helllllo",'l'));
	}
}
