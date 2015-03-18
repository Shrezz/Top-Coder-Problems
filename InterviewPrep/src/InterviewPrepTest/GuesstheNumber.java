package InterviewPrepTest;

public class GuesstheNumber {
	public static int noGuesses(int upper, int answer){
		int lower =1; int x=0; int count=0;
		while(true){
			if(x==answer) return count;
			x= (lower+upper)/2;
			if(x>answer) upper = x-1;
			if(x<answer) lower = x+1;
			count++;
		}
	}
	public static void main(String args[]){
		System.out.println(noGuesses(9,6));
	}
}
