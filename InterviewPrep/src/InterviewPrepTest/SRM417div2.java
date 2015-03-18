package InterviewPrepTest;

public class SRM417div2 {
	public static void main(String args[]){
		int x = 654;
		int y = 789;
		String s1 = String.valueOf(x);
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) s2+= s1.charAt(i);
		int a = Integer.parseInt(s2);	
		String s3 = String.valueOf(y);
		String s4="";
		for(int i=s3.length()-1;i>=0;i--) s4+= s3.charAt(i);
		int b = Integer.parseInt(s4);
		int sum = a+b;	
		String s = String.valueOf(sum);
		String str="";
		for(int i=s.length()-1;i>=0;i--) str+= s.charAt(i);
		System.out.println(str);
	}
}
