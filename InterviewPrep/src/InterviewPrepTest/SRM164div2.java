package InterviewPrepTest;

public class SRM164div2 {
	public static String[] justify(String[] textIn){
		int max= textIn[0].length();
		for(int i=1;i<textIn.length;i++){
			if(max<textIn[i].length()) max = textIn[i].length();
		}
		for(int i=0;i<textIn.length;i++){
			if(textIn[i].length() !=max){
				int spaces = max-textIn[i].length();
				textIn[i] = new String(new char[spaces]).replace("\0", " ") +textIn[i];
			}else{
				textIn[i] =textIn[i];
			}
		}
		return textIn;
	}
	public static void main(String args[]){
		String[] arr = new String[]{"BOB","TOMMY","JIM"};
		justify(arr);
	}
}
