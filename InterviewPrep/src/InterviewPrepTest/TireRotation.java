package InterviewPrepTest;

public class TireRotation {
	public static int getCycle(String initial, String current){
		String[] phases = new String[initial.length()];
		phases[0] = initial;
		for(int i=1;i<phases.length;i++){
			phases[i] = String.valueOf(initial.charAt(initial.length()-1));
			phases[i] +=  initial.charAt(initial.length()-2);
			phases[i] +=  initial.charAt(initial.length()-4);
			phases[i] += initial.charAt(initial.length()-3);
			if(phases[i].equalsIgnoreCase(current)) return i+1;
			initial = phases[i];
		}
		return -1;
	}
	public static void main(String args[]){
		System.out.println(getCycle("ABCD","CDBA"));
		String str = "SSD-B---BD-DDSB-----S-S--------S-B----BSB-S--B-S-D";
		int count=0;
		String[] ar = new String[str.length()];
		ar = str.split("--B|-S-|D");
		for(int i=0;i<ar.length;i++){
			System.out.println("ar[i]"+ ar[i]);
			if(ar[i].equalsIgnoreCase("-")) {
				count++;
			}else{
			for(int j=0;j< ar[i].split("--B|-S-|D|-").length;j++){
				System.out.println("ar[j] split: "+ar[i].split("--B|-S-|D|-")[j]);
				if(ar[i].split("--B|-S-|D|-")[j].equalsIgnoreCase("-")) count++;
			}
		}}
		System.out.println(count);
	}
}
