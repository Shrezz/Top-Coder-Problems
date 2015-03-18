package InterviewPrepTest;

import java.math.BigInteger;

public class Factorial {
	public static BigInteger factorial(int num){
		return num == 1 ? BigInteger.ONE : BigInteger.valueOf(num).multiply(factorial(num - 1));
		
	}
	public static void main(String args[]){
		//BigInteger b = new BigInteger("10");
		System.out.println(factorial(20));
	}
}
