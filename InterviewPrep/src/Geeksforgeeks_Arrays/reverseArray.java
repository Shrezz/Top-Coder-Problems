package Geeksforgeeks_Arrays;

public class reverseArray {
	public static void reverse_array(int[] ar){
		int left =0; int right =ar.length-1;
		while(left<right){
			int temp =ar[left];
			ar[left] = ar[right];
			ar[right] = temp; left++;
			right--;
		}
		for(int num:ar) System.out.print(num+"-->");
	}
	public int[] recurse_reverse(int[] ar, int start,int end){
		//for(int num:ar) System.out.print(num+"-->");
		if(start>end) return null;
		else{
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			
			return recurse_reverse(ar,start+1,end-1);
		}
	}
}
