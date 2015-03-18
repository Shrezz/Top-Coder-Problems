package InterviewPrepTest;

public class SRM171div2 {
	public static int[] dieRolls(String[] dice){
		int min=0; int max=0;
		for(int i=0;i<dice.length;i++){
			min += Integer.parseInt(dice[i].split("d")[0])*1;
			max += Integer.parseInt(dice[i].split("d")[0])*Integer.parseInt(dice[i].split("d")[1]);
		}
		int [] results = new int[3];
		results[0] =min;
		results[1]= max;
		results[2] =(min+max)/2;
		return results;
	}
	public static void main(String args[]){
		String[] ar = new String[]{"3d4","1d6"};
		int[] results = dieRolls(ar);
		for(int i=0;i<results.length;i++) System.out.println(results[i]);
	}
}
