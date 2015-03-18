package InterviewPrepTest;
import java.util.Arrays;
public class SRM156Div2 {
	
		public static int minDrives(int[] used, int[] total){
			int tot_capacity =0;
			for(int cap:used){
				tot_capacity+=cap;
			}
			System.out.println(tot_capacity);
			Arrays.sort(total);
			int count=0;int i= total.length-1;
			while(tot_capacity>0){
				count++;
				tot_capacity -= total[i];
				i=i--;
		}
		return count;
		}
		public static void main(String args[]){
			int[] a = new int[]{300,525};
			int[] b = new int[]{350,550};
			System.out.println(minDrives(a,b));
		}
	
}
