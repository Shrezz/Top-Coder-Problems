package InterviewPrepTest;

public class ProgressBar_SRM173div2 {
	public static String showProgress(int[] taskTimes, int tC){
		StringBuffer str=  new StringBuffer(20);
		int reqsum=0; int total_sum =0;
		for(int i=0;i< taskTimes.length;i++){
			total_sum+= taskTimes[i];
			if(i<tC) reqsum+= taskTimes[i];
		}
		for(int i=0;i< str.capacity();i++){
			double val = (double)reqsum/(double)total_sum;
			int per_age = (int) (str.capacity()*(val));
			if(i<=per_age) str.append('#');
			else str.append('.');
		}
		System.out.println(str.toString());
		return str.toString();
	}
	public static void main(String args[]){
		int[] ar = new int[] {19,6,23,17};
		showProgress(ar,3);
	}
}
