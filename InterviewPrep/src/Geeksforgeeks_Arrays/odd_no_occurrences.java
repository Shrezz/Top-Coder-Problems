package Geeksforgeeks_Arrays;

public class odd_no_occurrences {

	public static int find_odd(int[] ar){
		//{1, 2, 3, 2, 2, 1, 3}
		int res=0;
		for(int i=0;i<ar.length;i++){
			res = res^ ar[i];
		}
		return res;}
	public static int find_bits(int a,int b){
		int c = a^b;
		int bit_count =0;
		while(c!=0){
			bit_count += c&1;
			c = c>>>1;
		}
		return bit_count;
	}
}
