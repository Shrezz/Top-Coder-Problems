package InterviewPrepTest;

public class SRM168div2StairClimb {
	public static int stridesTaken(int[] flights, int stairsPerStride){
		int count=0;
		for(int i=0;i<flights.length;i++){
			int rem =  flights[i]/stairsPerStride;
			count+= rem;
			if((flights[i]%stairsPerStride)!=0){
				count++;
			}
			if(i != flights.length-1)
				count+=2;
		}
		return count;
	}
	public static void main(String args[]){
		int[] flights = new int[] {5,11,9,13,8,30,14};
		System.out.println(stridesTaken(flights,3));
	}
}
