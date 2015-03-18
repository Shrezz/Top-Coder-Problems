package InterviewPrepTest;

public class Yahtzee {

	public static void main(String args[]){
		String ms = "www.space%20.com%201";
		//ms.replace('%', ' ');
		for(int i=0;i<ms.length();i++){
			int index = ms.indexOf("%20");
			if(index!=-1){
				ms = ms.substring(0, index)+" "+ms.substring(index+3, ms.length());
			}}
		System.out.println(ms);
		//ms = ms.replace("%20", " ");
		int a =5;int b=10;
		String s="";
		s += s.valueOf(10);
		
		
	}
}
