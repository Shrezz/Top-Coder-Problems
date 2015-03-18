package InterviewPrepTest;

public class TransportCounting {
	
	public static int countBuses(int speed, int[] positions, int[] velocities, int time){
		if(positions.length != velocities.length){
			return 0;
		}
		int count =0;
		int trav = time*speed;
		for(int i=0;i<positions.length;i++){
			if(trav>= (positions[i]+time*velocities[i])){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		
		int[] positions = new int[]{0,0,0};
		int[] velocities = new int[]{4,5,6};
		int count = countBuses(5,positions,velocities,10);
		System.out.println(count);
	}

}
