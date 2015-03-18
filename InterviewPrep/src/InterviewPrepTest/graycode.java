package InterviewPrepTest;

public class graycode {

	//Two numbers are said to be in graycode sequence if they differ by only one bit. to find: a^b should be a power of 2.
	public static boolean isGraycode(int a,int b){
		int count =0;
		while(a>0 || b>0){
			if((a&1) != (b&1)) count++;
				a = a>> 1;
				b = b>>1;
		}
		return count<2;
	}
	
	public static boolean gray_code_neighbors(int a, int b){
	  int x = a ^ b;
	  System.out.println(-x+" "+x);
	  return (x > 0) && ((x & -x) == x);
	}
	public static void main(String args[]){
		System.out.println(isGraycode(14,10));
		System.out.println(gray_code_neighbors(1,3));
	}
}
