package InterviewPrepTest;

public class findGCD_LCM {
	
	public static int GCD(int a,int b){
		if(b==0) return a;
		else return GCD(b,a%b);
	}
	public static int GCD_recursive(int a,int b){
		while(b>0){
			int temp = b;
			b = a%b;
			a=temp;
		}
		return a;
	}
	public static int LCM(int a,int b,int GCD){
		return (a*b)/GCD;
	}
	private static int lcm(int a, int b)
	{
	    return a * (b / GCD(a, b));
	}
	public static int lcm(int[] input)
	{
	    int result = input[0];
	    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	    return result;
	}
	
	
	public static void main(String args[]){
		//int GCD =GCD_recursive(4,6);
		int a = 1;
		int b =5;
		findLCM fl = new findLCM();
		int lcm=1;
		for(int i=a;i<=b;i++){
			lcm = fl.LCM(lcm, i);
		}
		System.out.println(lcm);
		/*int[] ar = new int[b];
		for(int i=0;i<ar.length;i++){
			ar[i] = a+i;
		}
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
		System.out.println(lcm(ar));*/
		//System.out.println(LCM(4,5,GCD));
	}
}	
class findLCM{
	private static int GCD(int a,int b){
		if(b==0) return a;
		else return GCD(b,a%b);
	}
	public static int LCM(int a,int b){
		return (a*b)/GCD(a,b);
	}
}
