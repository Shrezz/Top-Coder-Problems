package Geeksforgeeks_Arrays;

public class majorityElement {
//Boyer-Moore algorithm Complexity : O(n)
	public static char findMajorityEle(char[] arr){
		int count=0; char me=' ';
		for(int i=0;i<arr.length;i++){
			//System.out.println(me);
			if(count==0) ; me =arr[i];
			if(arr[i] == me) count++;
			else count--;
		}
		count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == me) count++;
		}
		if(count> (arr.length/2)) return me;
		return ' ';
		
	}
}
