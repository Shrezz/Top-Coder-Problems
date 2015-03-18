package stacksANDqueues;

import LinkLists.Node;

public class Stacks {
	public int capacity;
	public int size=0;
	public Node top , bottom;
	public Stacks(int capacity){
		this.capacity=capacity;
	}
	
	public boolean isFull(){
		return capacity == size;
	}
}
