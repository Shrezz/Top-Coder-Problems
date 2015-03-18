package InterviewPrepTest;

public class SRM181div2 {
// If he stands still and the shot is at height 1 or 2, then he gets hit. If he jumps and the shot is at a height above 2, then he is also hit. O
	public static int hitsTaken(int[] pattern, String jumps){
		int hitcount=0;
		for(int i=0;i<jumps.length();i++){
			if(jumps.charAt(i) =='S' && (pattern[i] == 1 || pattern[i] ==2)){
				hitcount++;
			}
			if(jumps.charAt(i) == 'J' && pattern[i]>2){
				hitcount++;
			}
		}
		return hitcount;
	}
}
