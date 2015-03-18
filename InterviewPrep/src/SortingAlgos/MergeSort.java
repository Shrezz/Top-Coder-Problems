package SortingAlgos;
//Average & Worst case: O(nlogn);  Memory : depends;
public class MergeSort {
	public static void mergesort(int[] array){
		int[] helper = new int[array.length];
		mergesort(array,helper,0,array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"->");
		}}
	private static int[] mergesort(int[] array, int[] helper, int low, int high){
		if(low<high){
		int mid = (low+high)/2;
		mergesort(array,helper,low,mid);
		mergesort(array,helper,mid+1,high);
		merge(array,helper,low,mid,high);
	}
		return array;
	}
	private static int[] merge(int[] array, int[] helper, int low,int mid, int high){
		
		for(int i=0;i<helper.length;i++){
			helper[i] = array[i];}
		int leftHelper = low;
		int rightHelper = mid+1;
		int  current = low;
		while(leftHelper<=mid && rightHelper<=high){
			if(helper[leftHelper]<= helper[rightHelper]){
				array[current] = helper[leftHelper];
				leftHelper++;
			}
			else{
				array[current] = helper[rightHelper];
				rightHelper++;
			}
			current++;
		}
		int remaining = mid-leftHelper;
		for(int i=0;i<=remaining;i++){
			array[current+i] = helper[leftHelper+i];
		}
		return array;	
	}
	public static void main(String args[]){
		int[] arr = new int[] {2,9,8,7,1,6,5};
		mergesort(arr);
	}
}
