package InterviewPrepTest;

public class WidgetRepairs {

		public static int days(int[] arrivals, int numPerDay){
			
		float count =0; float total=0;
		for(int a:arrivals){
			total+=a;
			if(total>0){
				count+=1;
				total = Math.max(0,total-numPerDay);
			}}
		System.out.println(count);
		if(total>0) 
		{
			count+= Math.ceil(total/numPerDay);
			}
		return (int)count;
		}
		public static void main(String args[]){
			int[] arrivals = new int[]{ 10, 0, 0, 4, 20 };
			int numPerDay = 8;
			System.out.println(days(arrivals,numPerDay));
		}
	}

