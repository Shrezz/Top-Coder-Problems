package Geeksforgeeks_Arrays;

import java.util.HashSet;

//time complexity: if using sorting: O(nlogn); if using HashMaps - n.
public class findsum {
	public static void findnum(int[] ar, int sum){
		int[] result = new int[2];
		int[] helper = new int[ar.length];
		int[] sorted_ar = merge_sort(ar,helper,0,ar.length-1);
		int left =0;int right=sorted_ar.length-1;
		while(left<right){
			if(sorted_ar[left] + sorted_ar[right] == sum) {
				result[0] = sorted_ar[left];
				result[1]=sorted_ar[right];
				break;
			}
			else if(sorted_ar[left] + sorted_ar[right] < sum) left++;
			else right--;
		}
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}	
	}
	private static int[] merge_sort(int[] ar,int[] helper,int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			merge_sort(ar,helper,low,mid);
			merge_sort(ar,helper,mid+1,high);
			merge(ar,helper,low,mid,high);
		}
		return ar;
	}
	private static int[] merge(int[] ar,int[] helper,int low,int mid,int high){
		for(int i=0;i<ar.length;i++) helper[i] = ar[i];
		int helperLeft = low;
		int helperRight = mid+1;
		int current = low;
		while(helperLeft<= mid && helperRight <= high){
			if(helper[helperLeft] <= helper[helperRight]){
				ar[current] = helper[helperLeft];
				helperLeft++;
			}
			else{
			ar[current] = helper[helperRight];
			helperRight++;
		} 
			current++;
		}
		int remaining = mid-helperLeft;
		for(int i=0;i<=remaining;i++){
			ar[current+i] = helper[helperLeft+i];
		}
		return ar;
	}
	public static void findSum(int[] ar,int sum){
		HashSet<Integer> num = new HashSet<Integer>();
		for(int n: ar){
			num.add(n);
		}
		int[] result = new int[2];
		for(int i=0;i<ar.length;i++){
			int temp = sum-ar[i];
			if(num.contains(temp)){
				result[0] = temp;
				result[1] = ar[i];
			}
		}
		System.out.println(result[0]);
		System.out.println(result[1]);
		
	}
}
