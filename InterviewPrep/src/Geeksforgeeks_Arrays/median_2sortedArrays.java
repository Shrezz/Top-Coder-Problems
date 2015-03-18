package Geeksforgeeks_Arrays;

public class median_2sortedArrays {
	public static int find_median(int[] a1, int[] a2,int size){
		if(size<=0) return -1;
		if(size==1) return (a1[0]+a2[0])/2;
		if(size==2) return ((Math.max(a1[0], a2[0])+Math.min(a1[1], a2[1]))/2);
		int m1=0; int m2=0;
		m1 = median(a1,a1.length);
		m2 = median(a2,a2.length);
		if(m1==m2) return m1;
		//else
		
		return m1;
	}
	private static int median(int[] ar,int size){
		if(size%2==0) return (ar[(size-1)/2]+ar[size/2]);
		else return ar[size/2];
	}
}
