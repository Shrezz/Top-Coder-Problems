package InterviewPrepTest;

public class SRM356div2 {
	public static void main(String args[]){
			String test = "What is the weather like today?";
			test = test.replaceAll("\\p{P}","");
			System.out.println(test);
			test = test.toLowerCase();
			test = test.replace("and","&");
			test = test.replace("ate","8");
			test = test.replace("at","@");
			test = test.replace("you","U");
			System.out.println(test);
		
	}
}
