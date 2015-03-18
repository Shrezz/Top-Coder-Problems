package InterviewPrepTest;

import java.util.ArrayList;

public class Inchworm {
	public static int lunchtime(int branch,int rest,int leaf){
		int count =1;
		for(int i=leaf;i<= branch;i+=leaf){
			if(i%rest==0)count++;
		}
		return count;
	}
	public static void main(String args[]){
		System.out.println(lunchtime(1000,7,3));
	}
}
