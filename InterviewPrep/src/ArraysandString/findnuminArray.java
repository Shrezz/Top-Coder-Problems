package ArraysandString;

public class findnuminArray {

	public static int findPos(int[] ar, int key){
		int l=0;int h=1;
		int val =ar[0];
		while(val<key){
			l = h;
			h = 2*h;
			val = ar[h];
		}
		return binarySearch(ar,l,h,key);
	}
	public static int binarySearch(int[] ar, int l,int h, int key){
		if(h>=l){
			int mid = l+(h-l)/2;
			if(ar[mid] == key) return mid;
			if(ar[mid]>key) {
				return binarySearch(ar,l,mid-1,key);
			}
			return binarySearch(ar,mid+1,h,key);
		}
		return -1;
	}
	public static void main(String args[]){
		int[] ar = new int[]{1,1,2,4,6,8,10};
		int n = findPos(ar,4);
		if(n >0){
			System.out.println("Index of element is:"+n);
		}
		else{
			System.out.println("Element not found");
		}
	}
	
}
