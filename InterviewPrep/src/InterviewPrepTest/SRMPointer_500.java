package InterviewPrepTest;

public class SRMPointer_500 {
	//public class CartInSupermarketEasy{
		public static int calc(int N,int K){
			if(N==1) return 2;
			return calc(Math.max(N/2,N-N/2),Math.max(0, K-1))+1;
		}
		public static void main(String args[]){
			System.out.println(calc(5,0));
		}
	}

