package InterviewPrepTest;

public class numberof0s_Factorial {
	public static int number_of_0s(int number){
		int count=0;
		if(number<0) return -1;
		if(number==5) return 1;
		for(int i=5;number/i>=1;i*=5){
			count+= number/i;
		}
		return count;
	}
	public static void main(String args[]){
		System.out.println(number_of_0s(6250));
	}
}
