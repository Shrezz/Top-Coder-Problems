package InterviewPrepTest;

import java.util.Collections;

public class Time {

	public static final int SECS_HOUR = 3600;
	public static final int MINS_HOUR = 60;
	public static final int SECS_MIN = 60;
	public static String whatTime(int secs){
		String time;
		int H=0,M=0,S =0;
		if(secs<SECS_HOUR){
			time = String.valueOf(H)+":"+String.valueOf(M)+":"+String.valueOf(S);;
		}
		else{
			H = secs/SECS_HOUR;
			if((secs - (SECS_HOUR*H))>=MINS_HOUR){
				M= (secs-(SECS_HOUR*H))/60;
			}
			else{
				M=1;
			}
			if(secs-((SECS_HOUR*H)+(60*M))>=SECS_MIN){
				S = secs-((SECS_HOUR*H)+(60*M))/60;
			}
			else{
				S=secs-((SECS_HOUR*H)+(60*M));
			}
			time = String.valueOf(H)+":"+String.valueOf(M)+":"+String.valueOf(S);
			}
		return time;
	}
	public static void main(String args[]){
		System.out.println(whatTime(86399));
		int[] ar =  new int[3];
		
	}
}
