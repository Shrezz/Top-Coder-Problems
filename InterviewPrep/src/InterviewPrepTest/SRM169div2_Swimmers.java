package InterviewPrepTest;

import java.util.Arrays;

public class SRM169div2_Swimmers {
	public static int[] getSwimTimes(int[] distances, int[] speeds, int current){
		int[] results = new int[distances.length];
		for(int i=0;i<distances.length;i++){
			if(distances[i] == 0) results[i] =0;
			else if(speeds[i]<current) results[i] =-1;
			else{
				if(speeds[i] ==0 || speeds[i] - current ==0) results[i] =-1;
				else{
					results[i] = (int)Math.floor(((double)distances[i]/(double)(speeds[i]+current))+((double)distances[i]/(double)(speeds[i]-current)));
				}
			}
		}
		return results;
	}
	public static void main(String args[]){
		int[] distances = new int[]{ 7507, 7517, 7523, 7529, 7537, 7541, 7547, 7549, 7559, 7561, 7573, 7577, 7583,
				  7589, 7591, 7603, 7607, 7621, 7639, 7643, 7649, 7669, 7673, 7681, 7687, 7691,
				  7699, 7703, 7717, 7723, 7727, 7741, 7753, 7757, 7759, 7789, 7793, 7817, 7823,
				  7829, 7841, 7853, 7867, 7873, 7877, 7879, 7883, 7901, 7907, 7919 }
;
		int[] speeds = new int[]{ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
				  73, 79, 83, 89, 97, 99, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30,
				  32, 34, 36, 38, 40, 42, 44, 46, 48, 51 };
		int[] results = getSwimTimes(distances,speeds, 6);
		int[] a= new int[]{ -1,  -1,  -1,  8108,  1950,  1474,  1014,  882,  705,  544,  507,  420,
				  377,  359,  328,  290,  260,  252,  229,  216,  210,  195,  185,  173,
				  159,  155,  -1,  -1,  4409,  2413,  1717,  1354,  1127,  969,  852,  764,
				  692,  635,  585,  543,  507,  476,  449,  424,  402,  383,  365,  349,
				  334,  314 };
		for(int time: results){
			System.out.print(time+" ");
		}
		System.out.println();
		System.out.println(Arrays.equals(results, a));
	}
}
