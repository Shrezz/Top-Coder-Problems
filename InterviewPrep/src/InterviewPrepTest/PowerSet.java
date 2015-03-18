package InterviewPrepTest;

public class PowerSet {
	
	public static void generatePowerSet(String str){
		int temp;
		for(int i=0;i< Math.pow(2, str.length());i++){
			temp=i; 
			StringBuffer result= new StringBuffer();
			for(int j=0;j<str.length();j++){
				if(findLSB(temp)){
					result.append(str.charAt(j));}
				temp = temp>>>1;
				}
			System.out.println(result.toString());
	}}
	
	public static void PowerSet(int num){
		int temp;
		for(int i=0;i< Math.pow(2, num);i++){
			temp=i;
			StringBuffer result= new StringBuffer();
			for(int j=0;j<num;j++){
				if(findLSB(temp)){
					result.append(1);}
				else{
					result.append(0);
				}
				temp = temp>>>1;
				}
			System.out.println(result.toString());
	}
	}
	
	public static boolean findLSB(int temp){
		temp = temp&1;
		if(temp==1) return true;
		else return false;
	}
	
	public static void main(String args[]){
		PowerSet(4);
	}
}
