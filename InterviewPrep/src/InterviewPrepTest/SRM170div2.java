package InterviewPrepTest;

public class SRM170div2 {
	public static int toNextLevel(int[] expN,int received){
		int exp_o=0;
		int R = received;
		int[] exp_diff = new int[expN.length];
		exp_diff[0] = expN[0];
		for(int i=1;i<expN.length;i++){ 
			exp_diff[i] = expN[i]-expN[i-1];
		}
		for(int num: exp_diff){
			exp_o = Math.abs(num-R);
			System.out.println(exp_o+" "+R+" "+received);
			if(exp_o<num && exp_o !=0)return exp_o;
			else R = exp_o;
		}
		return exp_o;
	}
	public static int NextLevel(int[] expN, int received){
		for(int i=0;i<expN.length;i++){
			if(expN[i]> received) return expN[i] - received;
		}
		return 0;
	}
	public static void main(String args[]){
		int[] exp = new int[]{150,450,900,1800};
		System.out.println(NextLevel(exp,133));
	}
}
