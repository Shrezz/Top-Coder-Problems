package Geeksforgeeks_Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class lonelynumber {
	public static int lonelyinteger(int[] ar){
		int[] count = new int[100];
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++){
			hs.put(ar[i],count[ar[i]]++ );	}
		for(int i=0;i<ar.length;i++){
			if(hs.get(i)%2 ==1) return (int) hs.get(i);
		}
		return 0;
		
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
        int res;
        System.out.println("Enter the number of elements");
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        System.out.println("Enter the elements");
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
	}
}
