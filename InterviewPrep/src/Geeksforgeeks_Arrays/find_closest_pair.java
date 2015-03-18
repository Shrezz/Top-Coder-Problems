package Geeksforgeeks_Arrays;

public class find_closest_pair {
	public static void find_pair(int[] ar, int num){
		int left= 0; int right = ar.length-1;
		int diff = Integer.MAX_VALUE; int[] result = new int[2];
		while(left<right){
			if(Math.abs((ar[left]+ar[right]) -num) <diff){
				diff = Math.abs(num-(ar[left]+ar[right]));
				result[0] = ar[left];
				result[1] = ar[right];
			}
			if((ar[left]+ar[right]) <num) left++;
			else right--;
		}
		System.out.println(result[0] + "," +result[1]);
	}
}
