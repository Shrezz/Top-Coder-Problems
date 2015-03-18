package InterviewPrepTest;

public class SRM370div2 {
	public static int wastedSpace(int[] containers, int[] packages){
		int total=0; int size=0;
		for(int container:containers) total+= container;
		for(int pack:packages) size+= pack;
		if(size==total) return 0; 
		int space_waste=0; int space_prev=0;
		for(int i=0;i<containers.length;i++){
			if(containers[i] - packages[i] >0){
				space_waste+= (containers[i] - packages[i]);
				space_prev = (containers[i] - packages[i]);
			}
			if(space_prev- packages[i]>=0){
				space_waste = space_waste-space_prev;
			}
		}	
		return space_waste;	
	}
}
