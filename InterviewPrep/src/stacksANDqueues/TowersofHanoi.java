package stacksANDqueues;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TowersofHanoi {
	
	private Stack<Integer> disks;
	private int index;
	public TowersofHanoi(int i){
		disks = new Stack<Integer>();
		index=i;
	}
	public int index(){
		return index;
	}
	public void add(int d){
		if(!disks.isEmpty() && disks.peek()<=d){
			System.out.println("Error in placing disk "+ d);
		}
		else disks.push(d);
	}
	public void moveTop(TowersofHanoi t){
		int top = disks.pop();
		t.add(top);
		System.out.println("Move disk "+ top+" from "+index() +"to "+t.index());
	}
	public void moveDisks(int n, TowersofHanoi destination, TowersofHanoi buffer){
		if(n>0){
			moveDisks(n-1,buffer,destination);
			moveTop(destination);
			buffer.moveDisks(n-1,destination,this);
		}
	}
	public static void main(String args[]){
		int n=3;
		Scanner in = new Scanner(System.in);
		Map<Character,Integer> set = new HashMap<Character,Integer>();
		Iterator iter = (Iterator) set.entrySet();
		
		TowersofHanoi[] towers = new TowersofHanoi[n];
		for(int i=0;i<3;i++){
			towers[i] = new TowersofHanoi(i);
 		}
		for(int i=n-1;i>=0;i--){
			towers[0].add(i);
		}
		towers[0].moveDisks(n, towers[2], towers[1]);
	}
}
